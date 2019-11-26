package TestFile;

import java.io.File;
import java.io.FilenameFilter;

public class TestFile03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new TestFile03().run();

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
        String[] fns=f.list(new FilenameFilter(){

            @Override
            //匿名的内部类，在代码返回之前就实现也是可以的
            public boolean accept(File dir, String name) {
                if (name.endsWith(".java")) return  true;
                return false;
            }
        });
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

