package TestFile;

import java.io.File;
import java.io.FilenameFilter;
public class TestFile02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new TestFile02().run();

    }
    public void run() {
        File f=new File("D:\\tmp\\a\\b\\c");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        String[] fn=f.list();
        for( String fnd:fn){
            if (fnd.endsWith(".java")) {
                System.out.println(fnd);
            }
        }
        System.out.println("***********************");
        String[] fns=f.list(new FileNameFilter());
        //File[] f1=f.listFiles();
        for(String file:fns){
            System.err.println(file+" "+file.length()/1024+"kb");
        }


    }
    class FileNameFilter implements FilenameFilter{

        @Override
        public boolean accept(File dir, String name) {
            // TODO Auto-generated method stub
            if(name.endsWith(".java")) return true;
            return false;
        }

    }

}

