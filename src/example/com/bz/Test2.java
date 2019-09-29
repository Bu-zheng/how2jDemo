package example.com.bz;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * @Title: Test2
 * @Package: example.com.bz
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-14 上午 11:31
 * @Version: 1.0
 */
public class Test2 {

    public static void main(String[] args) {
//      Map<Byte, String> map = new HashMap<>();
//      map.put((byte) 1,"a");
//      map.put((byte) 2,"b");
//      map.put((byte) 3,"c");
//      map.put((byte) 4,"d");
//        List<Integer> integers1 = Arrays.asList(1,2,3,4);
//        List<Integer> integers2 = Arrays.asList(2);
//        System.out.println(integers2.containsAll(integers1));

    //        Date currentTime = new Date();
    //        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //        String dateString = formatter.format(currentTime);
    //        System.out.println(dateString);
    Map<String, Integer> map = new HashMap<>();
    map.put("1","11");
    map.pu("1",343);
    map.put("1",222);
        System.out.println(map.get("1"));



    }

    private static Date localDateTimeToDate(LocalDateTime nowDayStart) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = nowDayStart.atZone(zoneId);//Combines this date-time with a time-zone to create a  ZonedDateTime.
        return Date.from(zdt.toInstant());
    }
}
