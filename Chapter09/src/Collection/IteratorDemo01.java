package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<String> c = new ArrayList<>();

        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaEE");

        // Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator（）方法得到
        Iterator<String> it = c.iterator();

        // 用while循环改进元素的判断和获取
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
