package javaPrac.io;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        ReadFile manager = new ReadFile();

        String fullPath = File.separator+"Users"+File.separator+"sungyoungkim"
                +File.separator+"javaPrac"+File.separator+"src"
                +File.separator+"text"
                +File.separator+"numbers.txt";

        manager.readFile(fullPath);
    }

    public void readFile(String fileName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {

            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            String data;

            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

            System.out.println("read success!!!");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }

    }

    public void readWithScanner(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;


        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            System.out.println("read success");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (scanner != null) {
                scanner.close();
            }
        }
    }

}
