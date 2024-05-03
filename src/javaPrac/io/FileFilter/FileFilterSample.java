package javaPrac.io.FileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();

        String pathName = File.separator+"Users"+File.separator+"sungyoungkim"
                +File.separator+"javaPrac"+File.separator+"src"
                +File.separator+"text";

        sample.checkList(pathName);

    }

    public void checkList(String pathName) {
        File file;

        try {

            file = new File(pathName);
            // File[] mainFileList = file.listFiles();
            // File[] mainFileList = file.listFiles(new FileNameFilter());
            File[] mainFileList = file.listFiles(new JPGFileFilter());
            for (File data : mainFileList) {
                System.out.println(data.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
