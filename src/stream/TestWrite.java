package stream;

import java.io.*;

/**
 * @Classname TestWrite
 * @Description TODO
 * @Date 2019-11-28 10:32
 * @Created by lishaoteng
 */
public class TestWrite {
    public static void main(String[] args) {
        BufferedReader br=null;
        PrintWriter out=null;
        try {
            br=new BufferedReader(new FileReader("d:/tmp/hdfs.sql"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("d:/tmp/2.txt"));
            out=new PrintWriter(new BufferedWriter(new FileWriter("d:/tmp/2.txt")));
            String str=null;
            while ((str=br.readLine())!=null){
                /*bw.write(str);
                bw.newLine();*/
                out.println(str);

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
            if (out!=null)out.close();
        }
    }
}
