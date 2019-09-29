package example.com.bz.java8tset;

import example.com.bz.model.Buzheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Title: StreamTest5
 * @Package: example.com.bz.java8tset
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-14 下午 4:23
 * @Version: 1.0
 */
public class StreamTest5 {

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

        List<String> list3 = new ArrayList<String>();
        //差集 list1-list2
        List<String> collect2 = list1.stream().filter(num -> !list3.contains(num))
                .collect(Collectors.toList());
        System.out.println("差集list1-list2");
        collect2.stream().forEach(System.out::println);
    }
}
