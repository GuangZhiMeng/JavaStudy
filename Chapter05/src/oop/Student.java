package oop;
//类
public class Student {
    //属性：姓名，年龄
    String name;
    int age;

    //行为：学习，吃饭
    public void study(){
        System.out.println("学生学习……");
    }

    public void eat(){
        System.out.println("学生吃饭……");
    }

    //构造方法
    public Student(){
        System.out.println("我是Student类的构造方法");
    }
}
