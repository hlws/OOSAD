package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Classname TestWriteNumber01
 * @Description TODO
 * @Date 2019-11-27 11:08
 * @Created by lishaoteng
 */
public class TestWriteNumber01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
             fos=new FileOutputStream("d:/tmp/out.txt");
            String str="hello world";
            int len=0;
            byte[] buf=str.getBytes();
            fos.write(buf,0,buf.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
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
