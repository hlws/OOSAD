package stream;

import java.io.*;

/**
 * @Classname TestFileOutputStream
 * @Description TODO
 * @Date 2019-11-26 20:44
 * @Created by lishaoteng
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("D:\\tmp\\a\\b\\c\\Test.java");
            fos=new FileOutputStream("D:\\tmp\\Test.java");
            byte[] buf=new byte[1];
            int len=0;
            while ((len=fis.read(buf))>=0){
                fos.write(buf,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
