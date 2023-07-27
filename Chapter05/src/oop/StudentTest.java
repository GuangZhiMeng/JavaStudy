package oop;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student stu1 = new Student();

        stu1.name = "罗翔";
        stu1.age = 30;

        System.out.println(stu1.name);
        System.out.println(stu1.age);

        stu1.study();
        stu1.eat();

        System.out.println("********************");
        //创建第二个对象
        Student stu2 = new Student();

        stu2.name = "张三";
        stu2.age = 23;
        //stu2.name.sout
        System.out.println(stu2.name);
        System.out.println(stu2.age);

        stu2.study();
        stu2.eat();

    }
}
