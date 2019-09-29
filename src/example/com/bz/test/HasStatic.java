package example.com.bz.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Title: TeST
 * @Package: example.com.bz.test
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-11 上午 11:51
 * @Version: 1.0
 */
public class HasStatic{
    public static int aMethod(int i)throws Exception
    {
        try{
            return i / 10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }

        static boolean Paddy;
        public static void main(String args[]){
            System.out.println(Paddy);
        }

   }

