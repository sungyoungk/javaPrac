package javaPrac.io.FileFilter;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter implements FilenameFilter {

    @Override
    public boolean accept(File file, String name) {

        if(name.endsWith(".jpg") || name.endsWith(".JPG")) return true;
        return false;
    }
}
