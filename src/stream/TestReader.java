package stream;

import java.io.*;

/**
 * @Classname TestReader
 * @Description TODO
 * @Date 2019-11-28 9:56
 * @Created by lishaoteng
 */
public class TestReader {
    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader("d:/tmp/hdfs.sql"));
            String str=null;
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br!=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
