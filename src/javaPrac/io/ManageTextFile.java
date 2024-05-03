package javaPrac.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manager = new ManageTextFile();

        int numberCount = 10;

        String fullPath = File.separator+"Users"+File.separator+"sungyoungkim"
                +File.separator+"javaPrac"+File.separator+"src"
                +File.separator+"text"
                +File.separator+"numbers.txt";

        manager.writeFile(fullPath, numberCount);

    }

    public void writeFile(String fileName, int numberCount) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int loop = 0; loop <= numberCount; loop++) {
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }
            System.out.println("write success !!!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {

                    bufferedWriter.close();

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

            }
        }

    }


}
