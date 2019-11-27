package stream;

import java.io.*;
import java.util.Date;

/**
 * @Classname TestBufferedStream
 * @Description TODO
 * @Date 2019-11-27 9:33
 * @Created by lishaoteng
 */
public class TestBufferedStream {
    public static void main(String[] args) {
        long starttime=new Date().getTime();
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            fis=new FileInputStream("D:\\tmp\\a\\b\\c\\ICPU.java");
            bis=new BufferedInputStream(fis);
            bos=new BufferedOutputStream(new FileOutputStream("D:\\tmp\\ICPU.java"));
            byte[] buf=new byte[1024];
            int len=0;
            while ((len=bis.read(buf))>=0){
                bos.write(buf,0,len);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bis!=null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos!=null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        long endtime=new Date().getTime();
        System.out.println(starttime-endtime);
    }
}
