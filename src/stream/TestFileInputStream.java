package stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Classname TestFileInputStream
 * @Description TODO
<>* @Date 2019-11-26 15:48</>
 * @Created by lishaoteng
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        FileInputStream fis=null;

        {
            try {
                fis = new FileInputStream("D:\\tmp\\a\\b\\c\\Test.java");
                byte[] buf=new byte[512];
                int len=0;
                while ((len=fis.read(buf))>=0){
                    System.out.write(buf,0,len);

                }

                fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (fis!=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
