package example.com.bz.model;

/**
 * @Title: Son
 * @Package: example.com.bz.model
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-14 上午 11:31
 * @Version: 1.0
 */
public class Son extends Father{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Son{" +
                "age=" + age +
                '}';
    }
}
