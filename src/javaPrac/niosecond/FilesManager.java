package javaPrac.niosecond;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesManager {


    public static void main(String[] args) {
        FilesManager manager = new FilesManager();
        String fileName = "AboutThisBook.txt";
//        manager.writeAndRead(fileName);

        Path fromPath = manager.writeAndRead(fileName);
        manager.copyMoveDelete(fromPath, fileName);
    }

    public List<String> getContents(){
        List<String> contents = new ArrayList<String>();

        contents.add("이 책은 저자의 6 번 째 책입니다.");
        contents.add("제목은 자바의 신 입니다");
        contents.add("오늘의 날짜 : " + new Date());
        contents.add("이 책은 저자의 6 번 째 책입니다.");

        return contents;
    }

    public Path writeFile(Path path) throws Exception{
        Charset charset = Charset.forName("EUC-KR");
        List<String> contents = getContents();
        StandardOpenOption openOption = StandardOpenOption.CREATE;
        return Files.write(path, contents, charset, openOption);
    }

    public void readFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        System.out.println("path : " + path);

        List<String> fileContents = Files.readAllLines(path, charset);
        for(String tempContent : fileContents){
            System.out.println(tempContent);
        }
        System.out.println();
    }

    public Path writeAndRead(String fileName) {
        Path returnPath = null;
        try{
            Path path = Paths.get(fileName);
            returnPath = writeFile(path);

            System.out.println("***** Created file contents *****");

            readFile(returnPath);
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnPath;
    }

    public void copyMoveDelete(Path fromPath, String fileName) {
        try {

            Path toPath = fromPath.toAbsolutePath().getParent();

            // make directory if it does not exist
            Path copyPath = toPath.resolve("copied");

            if (!Files.exists(copyPath)) {
                Files.createDirectory(copyPath);
            }

            // copy file
            Path copiedFilePath = copyPath.resolve(fileName);
            StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
            Files.copy(fromPath, copiedFilePath, copyOption);

            //read file
            System.out.println("***** Copied file contents *****");
            readFile(copiedFilePath);

            // Move file
            Path movedFilePath = Files.move(copiedFilePath,
                    copyPath.resolve("moved.txt"), copyOption);

            // Delete files
            Files.delete(movedFilePath);
            Files.delete(copyPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
