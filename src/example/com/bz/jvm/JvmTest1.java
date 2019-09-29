package example.com.bz.jvm;

/**
 * @Title: JvmTest1
 * @Package: example.com.bz.jvm
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-07 下午 1:10
 * @Version: 1.0
 */
public class JvmTest1 {

    public static void main(String[] args) {
        /**
         * 对于静态字段来说，只有直接定义了 该字段的类才会被初始化
         */

//        System.out.println(MyChild1.str);
        System.out.println(MyChild1.str2);
    }

}

class MyParent{
    static {
        System.out.println("爷爷类");
    }
}

class Myparent1 extends MyParent{
    public static String  str = "hello world";

    static {
        System.out.println("Myparent1 ");
    }
}

class  MyChild1 extends Myparent1{

    public static String  str2 = "hello world2";


    static {
        System.out.println("MyChild1 ");
    }
}
