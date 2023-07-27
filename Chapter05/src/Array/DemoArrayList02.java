package Array;

import java.util.ArrayList;

public class DemoArrayList02 {
    public static void main(String[] args) {
        // 创建集合容器对象
        ArrayList<String> list = new ArrayList<>();

        // 调用对象的add方法，向容器中添加数据
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        // public int size()返回集合中的元素的个数
        int size = list.size();
        System.out.println(size);// 6
    }
}
