package example;

import example.com.bz.ser.impl.ASerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @Title: Java8Test2
 * @Package: example
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-06-28 下午 5:26
 * @Version: 1.0
 */
public class Java8Test2 {
    public static void main(String[] args) {
        List<String> lsit = new ArrayList<>();
            lsit.add("1");
            lsit.add("2");
            final ASerImpl aSer = new ASerImpl();

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

//        eval(intList, n-> n>2);
        int i = compute3(2, 3, (v1, v2) -> v1 + v2);//5
        System.out.println(i);
        i = compute3(2, 3, (v1, v2) -> v1 - v2) ;//-1
        System.out.println(i);
        i = compute3(2, 3, (v1, v2) -> v1 * v2) ;//6
        System.out.println(i);
    }

    private static void eval(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }

    public static int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }


}
