package oop;

public class ConstructorTest {
    public static void main(String[] args) {
        ConstructorMethod stu1 = new ConstructorMethod("张三",23);
        System.out.println(stu1.name + "……" + stu1.age);

        ConstructorMethod stu2 = new ConstructorMethod("李四",24);
        System.out.println(stu2.name + "……" + stu2.age);
    }
}
