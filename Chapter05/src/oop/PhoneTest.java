package oop;

import oop.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        //类名 对象名 = new 类名（）;
        Phone p1 = new Phone();
        p1.brand = "小米";
        p1.color = "白色";
        p1.price = 4999;

        System.out.println(p1.brand + "\t" + p1.color + "\t" + p1.price);

        //创建第二个对象
        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.color = "黑色";
        p2.price = 6999;

        System.out.println(p2.brand + "\t" + p2.color + "\t" + p2.price);

        p1.call("罗翔老师");
        p1.sendMessage();

        p2.call("张三");
        p2.sendMessage();
    }
}
