package example.com.bz.java8tset;

import example.com.bz.model.Buzheng;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Title: StreamTest4
 * @Package: example.com.bz.java8tset
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-02 上午 9:29
 * @Version: 1.0
 */
public class StreamTest4 {
        public static void main(String[] args) {
        Buzheng buzheng = new Buzheng("zhanng","1");
        Buzheng buzheng2 = new Buzheng("zhanng","2");
        Buzheng buzheng3 = new Buzheng("ss","3");
        Buzheng buzheng4 = new Buzheng("ss","4");

        List<Buzheng> buzhengs = Arrays.asList(buzheng, buzheng2, buzheng3, buzheng4);

                List<Buzheng> collect = buzhengs.stream().collect(Collectors.toList());

                for (int i = 0; i < collect.size(); i++) {
                        if (collect.get(i).getSex().equals("12")) {
                                collect.remove(i);
                        }
                }
                Map<String, Long> collect1 = buzhengs.stream().collect(Collectors.groupingBy(Buzheng::getName, Collectors.counting()));
                System.out.println(collect1     );

//                collect.forEach(i -> System.out.println(i.getSex()));
        /*
        List<Buzheng> buzhengss = Arrays.asList(buzheng, buzheng2);
                List<Buzheng> collect = buzhengs.stream().filter(item -> !buzhengss.contains(item)).collect(Collectors.toList());
                collect.forEach(itme -> System.out.println(itme.getSex()));*/

//        for (int i = 0; i < 100; i++){
//            if (i == 10) break;
//            System.out.println(i);
//           continue;
//        }

    }
}
