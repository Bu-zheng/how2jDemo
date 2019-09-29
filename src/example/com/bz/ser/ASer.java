package example.com.bz.ser;

public interface ASer {

    String hello(String string);

    default void hello2(String string){
        System.out.println(string);
    }
}
