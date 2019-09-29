package example.com.bz.ser.impl;

import example.com.bz.ser.ASer;
import example.com.bz.ser.BSer;

/**
 * @Title: ASerImpl
 * @Package: example.com.bz.ser.impl
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-06-22 下午 3:08
 * @Version: 1.0
 */
public class ASerImpl implements ASer, BSer {
    @Override
    public String hello(String string) {
        System.out.println("hello,hello");
        return null;
    }

    @Override
    public void hello2(String string) {
        System.out.println(string);
        System.out.println("冲突只能自己重写");
    }

    public static void main(String[] args) {
        new ASerImpl().hello("");
        new ASerImpl().hello2("你好！java");
    }

    public  static void test (){
        System.out.println("llllll");
    }

    public static void test(String s) {
        System.out.println(s);
    }
}
