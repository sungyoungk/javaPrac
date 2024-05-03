package javaPrac.io.File;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();

        String pathName = File.separator+"Users"+File.separator+"sungyoungkim"
                +File.separator+"javaPrac"+File.separator+"src"
                +File.separator+"text";
                // +File.separator+"javaPrac";


        // sample.checkPath(pathName);
        // sample.mkDir(pathName);
        sample.checkFileMethod(pathName);
        sample.canFileMethod(pathName);
        sample.lastModified(pathName);

    }

    public void checkPath(String pathName) {

        File file = new File(pathName);
        System.out.println(pathName + "is exist? " + file.exists());
    }

    public void mkDir(String pathName) {
        File file = new File(pathName);
        System.out.println("mkDir-" + file.mkdirs());
    }

    public void checkFileMethod(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + "is directory?" + file.isDirectory());
        System.out.println(pathName + "is file?" + file.isFile());
        System.out.println(pathName + "is hidden?" + file.isHidden());
    }

    public void canFileMethod(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + "can read?-" + file.canRead());
        System.out.println(pathName + "can write?-" + file.canWrite());
        System.out.println(pathName + "can execute?-" + file.canExecute());
    }

    public void lastModified(String pathName) {
        File file = new File(pathName);

        long date = file.lastModified(); //메소드
        Date lastModified = new Date(date);

        System.out.println("/t"+pathName + "last Modified: " + lastModified);
    }
}
