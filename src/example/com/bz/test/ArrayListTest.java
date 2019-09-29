package example.com.bz.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Title: ArrayListTest
 * @Package: example.com.bz.test
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-17 下午 4:54
 * @Version: 1.0
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> collect = list.stream().collect(Collectors.toList());
        collect.add(1);
        collect.forEach(item -> System.out.println(item));


    }
}
