package Array;

import java.util.ArrayList;

public class DemoArrayList01 {
    public static void main(String[] args) {
        // 创建集合容器对象
        ArrayList<String> list = new ArrayList<>();
        // 调用对象的add方法，向容器中添加数据
        // 单个添加 public boolean add(E e)
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        //System.out.println(list); // [111, 222, 333, 444]

        // 自定义位置添加 public void add(int index,E element)
        list.add(1,"666");
        System.out.println(list);// [111, 666, 222, 333, 444]
    }
}
