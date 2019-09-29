package example.com.bz;

import example.com.bz.model.Buzheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Title: Test
 * @Package: example.com.bz
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-12 下午 5:10
 * @Version: 1.0
 */
public class Test {

    private String str = "hello world";

    //成员内部类
    class A{

        public void test(){
            System.out.println(str);
        }
    }
    //匿名内部类
    {
        System.out.println();
    }

    public void  test(){
        String str_b = "hello java";
        A a = new A();
        a.test();
        //局部内部类
        class B{
            public void test_B(){
                System.out.println(str_b);
            }
        }
        B b = new B();
        b.test_B();

    }

    public static void main(String[] args) {
        Buzheng buzheng = new Buzheng("ss","ss");
        List<String> objects = new ArrayList<>();
        System.out.println(objects.size());
        System.out.println(objects.size());
        System.out.println(objects.size());
        System.out.println(objects.size());
        System.out.println(objects.size());
    }
}
