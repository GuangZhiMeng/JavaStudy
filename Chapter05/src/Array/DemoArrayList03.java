package Array;

import java.util.ArrayList;

public class DemoArrayList03 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        // 往集合对象中添加字符串对象
        list.add("张三");
        list.add("李四");
        list.add("王五");

        // 遍历集合 list.fori
        for (int i = 0; i < list.size(); i++) {
            // i:每一个索引值
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
