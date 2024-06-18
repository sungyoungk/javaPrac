package javaPrac.niosecond;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFiles {
    public static void main(String[] args) {
        PathAndFiles sample = new PathAndFiles();
        String dir = "/Users/sungyoung/study/javaPrac/src/javaPrac/nio/nio2";
        String dir2 = "/Users";
        //sample.checkPath(dir);
        sample.checkPath2(dir, dir2);
    }


    public void checkPath(String dir) {
        Path path = Paths.get(dir);
        System.out.println(path.toString());
        System.out.println("getFileName() : " + path.getFileName());
        System.out.println("getNameCount : " + path.getNameCount());
        System.out.println("getParent() : " + path.getParent());
        System.out.println("getRoot(): " + path.getRoot());
    }

    public void checkPath2(String dir1, String dir2) {
        Path path = Paths.get(dir1);
        Path path2 = Paths.get(dir2);

        Path relativized = path.relativize(path2);
        System.out.println("relativized path : " + relativized);

        Path absolute = relativized.toAbsolutePath();
        System.out.println("toAbsolutePath : " + absolute);

        Path normal = relativized.normalize(); 
        System.out.println("normalize path : " + normal);

        Path resolved = path.resolve("godofjava");
        System.out.println("resolved path : " + resolved);

    }
}
