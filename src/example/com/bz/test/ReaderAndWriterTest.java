package example.com.bz.test;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Title: ReaderAndWriterTest
 * @Package: example.com.bz.test
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-17 下午 3:20
 * @Version: 1.0
 */
public class ReaderAndWriterTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt");

        try (FileReader fileReader = new FileReader(file)){
            //创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) file.length()];
            fileReader.read(all);
            for (char c : all) {
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        test();
    }

    public static void test(){
        File f = new File("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt");
        System.out.println("默认编码方式:"+ Charset.defaultCharset());
        //FileReader得到的是字符，所以一定是已经把字节根据某种编码识别成了字符了
        //而FileReader使用的编码方式是Charset.defaultCharset()的返回值，如果是中文的操作系统，就是GBK
        try (FileReader fr = new FileReader(f)) {
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader会使用默认的编码方式%s,识别出来的字符是：%n",Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //FileReader是不能手动设置编码方式的，为了使用其他的编码方式，只能使用InputStreamReader来代替
        //并且使用new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); 这样的形式
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) f.length()];
            isr.read(cs);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
