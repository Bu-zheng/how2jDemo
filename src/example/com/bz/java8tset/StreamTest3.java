package example.com.bz.java8tset;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.L;

/**
 * @Title: StreamTest3
 * @Package: example.com.bz.java8tset
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-25 下午 4:53
 * @Version: 1.0
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3,4);

        List<Integer> list3 = list1.stream().collect(Collectors.toList());
        List<Integer> list4 = list2.stream().collect(Collectors.toList());
        list3.addAll(list4);


//        list3.forEach(System.out::println);

        BigDecimal b1 = new BigDecimal(1271265.5555);
        BigDecimal b2 = new BigDecimal(0);
//        BigDecimal divide = b1.divide(b2);
//        System.out.println(divide);
        double v = b1.doubleValue() / 10000;
        BigDecimal bigDecimal = new BigDecimal(0).setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println("ceshi==>"+bigDecimal);

        DecimalFormat df = new DecimalFormat("0.00");
        String format = df.format(v);
        System.out.println("double="+format);

        System.out.println("bigdecimal==>"+ new BigDecimal(1).divide(new BigDecimal(3), 2, BigDecimal.ROUND_DOWN));




    }
}
