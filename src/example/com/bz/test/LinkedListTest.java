package example.com.bz.test;

import example.com.bz.model.Hero;

import java.util.LinkedList;

/**
 * @Title: LinkedListTest
 * @Package: example.com.bz.test
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-17 下午 4:49
 * @Version: 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        //LinkedList是一个双向链表结构的list
        LinkedList<Hero> ll =new LinkedList<Hero>();

        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的英雄
        ll.addLast(new Hero("hero1"));
        ll.addLast(new Hero("hero2"));
        ll.addLast(new Hero("hero3"));
        System.out.println(ll);

        //在最前面插入新的英雄
        ll.addFirst(new Hero("heroX"));
        ll.forEach(item -> System.out.println(item));

        //查看最前面的英雄
        System.out.println("最前===》"+ll.getFirst().getName());
        //查看最后面的英雄
        System.out.println("最后===》"+ll.getLast().getName());

        //查看不会导致英雄被删除
        ll.forEach(item -> System.out.println(item));
        //取出最前面的英雄
        System.out.println("最前===》"+ll.removeFirst().getName());

        //取出最后面的英雄
        System.out.println("最后===》"+ll.removeLast().getName());

        //取出会导致英雄被删除
        ll.forEach(item -> System.out.println(item));
    }
}
