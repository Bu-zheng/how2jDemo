package example.com.bz.java8tset;

import example.com.bz.model.Buzheng;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Title: StreamTest2
 * @Package: example.com.bz.java8tset
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-25 下午 3:43
 * @Version: 1.0
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");

        List<String> list2 = new ArrayList<String>();
        list2.add("2");
        list2.add("7");
        list2.add("10");

        Buzheng buzheng = new Buzheng("ss","ss");
        Buzheng buzheng2 = new Buzheng("11","22");

        List<Buzheng> buzhengs = Arrays.asList(buzheng, buzheng2);
        List<Buzheng> buzhengs1 = Arrays.asList( buzheng2);

        List<Buzheng> collect = buzhengs.stream().filter(model -> !buzhengs1.contains(model)).collect(Collectors.toList());
        System.out.println(collect);


        String s = list1.stream().reduce((a, b) -> a +"-"+ b).get();
        System.out.println(s);

        //交集
        List<String> collect1 = list2.stream().filter(num -> list1.contains(num))
                .collect(Collectors.toList());
        System.out.println("交集");
        collect1.stream().forEach(System.out::println);

        //差集 list1-list2
        List<String> collect2 = list1.stream().filter(num -> !list2.contains(num))
                .collect(Collectors.toList());

        System.out.println("差集list1-list2");
        collect2.stream().forEach(System.out::println);


        //差集list2-list1
        List<String> collect3 = list2.stream().filter(num -> !list1.contains(num))
                .collect(Collectors.toList());
        System.out.println("差集list2-list1");
        collect3.stream().forEach(System.out::println);

    }
}
