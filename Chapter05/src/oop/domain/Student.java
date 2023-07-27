package oop.domain;

public class Student {
    //1、成员变量私有化
    private String name;
    private int age;

    //2、空参，带参构造方法
    //空参
    //右击——>生成——>构造函数——>age:int——>无选择
    public Student() {
    }

    //带参
    //右击——>生成——>构造函数——>全选——>确定
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3、对于私有的成员变量，提供对应的setXxx和getXxx方法
    //右键——>生成——>Getter 和 Setter——>全选——>enter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
