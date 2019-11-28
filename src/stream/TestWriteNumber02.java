package stream;

import java.io.*;

/**
 * @Classname TestWriteNumber01
 * @Description TODO
 * @Date 2019-11-27 11:08
 * @Created by lishaoteng
 */
public class TestWriteNumber02 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        DataOutputStream dos=null;
        DataInputStream dis=null;
        try {
             fos=new FileOutputStream("d:/tmp/out.txt");
             dos=new DataOutputStream(fos);
             dos.writeInt(123456789);
             dos.writeInt(12345678);
             dos.writeInt(1234567);
             dos.writeInt(123456);
             dis=new DataInputStream(new FileInputStream("d:/tmp/out.txt"));
             int a=dis.readInt();
             System.out.println(a);
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (dos!=null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
