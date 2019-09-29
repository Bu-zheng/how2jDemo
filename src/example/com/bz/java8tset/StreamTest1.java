package example.com.bz.java8tset;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @Title: StreamTest1
 * @Package: example.com.bz.java8tset
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-22 下午 2:25
 * @Version: 1.0
 */
public class StreamTest1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) +
                ""+ today.getDayOfMonth() +
                "日，" + today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("当前为：" + today.getYear() + "年" + "是否闰年" + today.isLeapYear());


        List<Byte> monthList = Arrays.asList((byte)1, (byte)3, (byte)5, (byte)7, (byte)8, (byte)10, (byte)12);
        System.out.println(monthList.stream().filter(item -> item == 2).count());


        LocalDate date = LocalDate.now();
        date = date.minusMonths(1);
        System.out.println(date);


    }
}
