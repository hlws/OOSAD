package TestFile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class TestFile04 {
    public static void main(String[] args) {
     new TestFile04().run();


    }
    public void run(){
        File f=new File("D:\\tmp\\a\\b\\c");
        File[] fs=f.listFiles(new DirFilter());
        for (File fn:fs){
            System.out.println(fn);
        };

    }
    class DirFilter implements FileFilter{
        @Override
        public boolean accept(File pathname) {
            if (pathname.isDirectory()) return  true;
            return  false;
        }
    }
}
