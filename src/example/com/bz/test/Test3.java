package example.com.bz.test;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Title: Test3
 * @Package: example.com.bz.test
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-08-28 上午 10:42
 * @Version: 1.0
 */
public class Test3 {
    public void bubbleSort(int[] list) {
        int temp = 0; // 用来交换的临时数
//        1,23,5,8,4,2,1,4,657,42,41;

        // 要遍历的次数
        for (int x = 0; x < list.length - 1; x++) {
            // 从后向前依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int y = list.length - 1; y > x; y--) {
                // 比较相邻的元素，如果前面的数大于后面的数，则交换
                if (list[y - 1] > list[y]) {
                    temp = list[y - 1];
                    list[y - 1] = list[y];
                    list[y] = temp;
                }
            }

            System.out.format("第 %d 趟：\t", x);
            List<Integer> integers = Ints.asList(list);
            integers.forEach(model -> System.out.print("\t"+model));
            System.out.println();
        }
    }

    // 对 bubbleSort 的优化算法
    public void bubbleSort_2(int[] list) {
        int temp = 0; // 用来交换的临时数
        boolean bChange = false; // 交换标志

        // 要遍历的次数
        for (int i = 0; i < list.length - 1; i++) {
            bChange = false;
            // 从后向前依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = list.length - 1; j > i; j--) {
                // 比较相邻的元素，如果前面的数大于后面的数，则交换
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    bChange = true;
                }
            }
            // 如果标志为false，说明本轮遍历没有交换，已经是有序数列，可以结束排序
            if (false == bChange)
                break;

            System.out.format("第 %d 趟：\t", i);
            List<Integer> integers = Ints.asList(list);
            integers.forEach(model -> System.out.print("\t"+model));
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[] i_ = {1,23,5,8,4,2,1,4,657,42,41};
        int[] i_2 = {2,4,3,6,1};
//        List<int[]> ints = Arrays.asList(i_);


//        List<Integer> integers = Ints.asList(i_);

//        Ordering<Comparable> natural = Ordering.natural();
//        List<Integer> integers1 = natural.sortedCopy(integers);//正序

//        Ordering<Comparable> reverse = natural.reverse();
//        List<Integer> integers1 = reverse.sortedCopy(integers);
//        integers1.forEach(model -> System.out.print("\t"+model));
//        System.out.println("===========");


//        Collections.sort(integers); //正序
//        integers.forEach(model -> System.out.print("\t"+model));

//        Collections.sort(integers, Comparator.reverseOrder());//倒序
//        integers.forEach(model -> System.out.print("\t"+model));

        Test3 t3 = new Test3();
        t3.bubbleSort(i_2);
    }
}
