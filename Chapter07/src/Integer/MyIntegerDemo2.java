package Integer;

public class MyIntegerDemo2 {
    // main 或者 psvm都行 都可以快速生成主方法
    public static void main(String[] args) {
        Integer i1 = 100;
    //      对象    = 默认是一个基本数据类型

    // jdk1.5 特性 —— 自动装箱

    // 装箱：把一个基本数据类型 变成对应的包装类
    // 自动：java底层会帮我们自动调用valueof方法
        System.out.println(i1);

    // jdk1.5的特性 —— 自动拆箱
    // 拆箱：把一个包装类型 变成对应的基本数据类型
        int i2 = i1;
        System.out.println(i2);

        Integer i3 = 100; // 把一个基本数据类型赋值给包装类 触发了 Java的自动装箱机制、
        i3 += 200;
        // 会先把i3这个对象变成基本数据类型100
        // 100 + 200 = 300
        // 把基本数据类型300再次自动装箱变成Integer对象赋值给i3
        System.out.println(i3);
    }
}
