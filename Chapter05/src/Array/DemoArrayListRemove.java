package Array;

import java.util.ArrayList;

public class DemoArrayListRemove {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        // 调用add方法，添加字符串
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
           String stu =  list.get(i);
           // 注：在集合中，如果删除了一个元素，后面的元素会整体向前移动，最后为null
           if(("test").equals(stu)){
               list.remove(i);
               i--;// 如果要删除一个集合中的所以元素，一定要在遍历集合中加上 i -- ，不然可能就会错过某些元素
           }
        }

        // 输出集合元素
        System.out.println(list);
    }
}
