package example;
import example.com.bz.model.Buzheng;
import sun.rmi.log.LogInputStream;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  private void te(int a, int b){
      for(int i = 0;i<10;i++){
          System.out.println(a+i);
      }
  }

  public static void main(String[] argv) {
//      List<Buzheng> list = new ArrayList<>();
//      list.add(new Buzheng("张三", "男"));
//      list.add(new Buzheng("李四", "男"));
//      Comparator<MathOperation> tComparator = (a, b) -> 5;
////      Comparator<MathOperation> t = () ->  list.stream().map(Buzheng::getName).collect(Collectors.toList());
//      test1();
//      test2();
//      System.out.println("hello world");
//        test2();
    Integer i = 3;
    Integer i2 = Integer.valueOf(3);
    Integer i3 = new Integer(3);
      System.out.println(i3 == i2);

  }


    private static void test2() {
        List<Buzheng> list = new ArrayList<>();
        list.add(new Buzheng("张三", "男"));
        list.add(new Buzheng("李四", "男"));
        list.add(new Buzheng("张三", "女"));
//    list.stream().map(Buzheng::getName).collect(Collectors.toList()).stream().forEach(System.out::println);
//        List<String> lsit = list.stream().map(Buzheng::getName).collect(Collectors.toList());
//        lsit.forEach(System.out::println);
        Buzheng buzheng = list.stream().filter(item -> item.getName().equals("张三")).findAny().orElse(null);
        System.out.println(buzheng.getSex());
    }

    /**
     * 去除重复元素
     */
  private static void test1(){
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("a");
    list.add("b");
    list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
  }

    interface MathOperation {
        int operation(int a, int b);
        
        List<String> list();
    }

}
