package oop.encapsulation;
/*
    1、私有成员变量（为了保证数据的安全性）

    2、针对私有成员变量，提供对应的setXxx和getXxx方法

    set：设置
    get：获取
 */
public class Student {
    private int age;//创建一个私有成员变量

    public void setAge(int age){
        if(age >= 1 && age <= 120){
            this.age = age;
            System.out.println("age = " + age);
        }else{
            System.out.println("年龄有误，请检查是否是1~120之间");
        }
    }

    public int getAge(){
        return age;
    }
}
