package example.com.bz.test;

import java.io.*;

/**
 * @Title: BufferTest
 * @Package: example.com.bz.test
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-17 下午 3:59
 * @Version: 1.0
 */
public class BufferTest {
    public static void main(String[] args) {
        writer();
    }

    /**
     * 读
     */
    private static void reader(){
        File f = new File("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt");

        try(
                FileReader fileReader = new FileReader(f);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){
            while (true) {
                // 一次读一行
                String line = bufferedReader.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        }catch (IOException  e){
            e.printStackTrace();
        }
    }

    private static void writer(){
        File f = new File("C:\\Users\\Administrator\\Desktop\\写.txt");

        try(
                FileWriter fileWriter = new FileWriter(f);
                PrintWriter printWriter = new PrintWriter(fileWriter);
        ){
            printWriter.println("garen kill teemo");
            printWriter.println("teemo revive after 1 minutes");
            printWriter.println("teemo try to garen, but killed again");
        }catch (IOException  e){
            e.printStackTrace();
        }
    }
}
