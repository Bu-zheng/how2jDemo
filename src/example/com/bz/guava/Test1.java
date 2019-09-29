package example.com.bz.guava;


import java.util.Optional;

/**
 * @Title: Test1
 * @Package: example.com.bz.guava
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-29 上午 11:44
 * @Version: 1.0
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        Integer in = 1;

        Optional<Integer> optional = Optional.ofNullable(in);
            System.out.println(Optional.ofNullable(in).isPresent());




    }


}
