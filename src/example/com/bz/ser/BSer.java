package example.com.bz.ser;

public interface BSer {

    default void  hello2(String string){
        System.out.println("2222");
        System.out.println(string);
    }
}
