package example.com.bz.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Title: Node
 * @Package: example.com.bz.test
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-07-17 下午 5:13
 * @Version: 1.0
 */
public class Node {

    /**
     * 左子节点
     */
    public Node leftNode;

    /**
     * 右子节点
     */
    public Node rightNode;

    /**
     * 存放的值
     */
    public Object value;

    /**
     * 插入数据
     */
    public void  add(Object object){
        //如果当前节点没有值，就把数据放在当前节点
        if(null == value){
            value = object;
        }else{//如果当前节点有值，就进行判断，新增的值与当前值的大小关系
            //新增的值，与当前值小伙相等
            if((Integer)object - (Integer) value <= 0){
                if(null == leftNode){
                    leftNode = new Node ();
                }
                leftNode.add(object);
            }else{            //新增的值，比当前打
                if(null == rightNode){
                    rightNode = new Node();
                }
                rightNode.add(object);
            }

        }
    }

    // 中序遍历所有的节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)

            values.addAll(rightNode.values());

        return values;
    }

    public static void main(String[] args) {
        Node node = new Node();
        List<Integer> intList = Arrays.asList(67, 7, 30, 73, 10, 0, 78, 81, 10, 74);
        for (Integer integer : intList) {
            node.add(integer);
        }

        System.out.println(node.values());
    }


}
