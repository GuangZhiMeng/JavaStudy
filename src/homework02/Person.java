package homework02;

//定义一个Person类
public class Person {
    //含有name和age属性
    String name;
    int age;

    //定义一个默认的不带参数的构造方法Person()
    public Person() {
        //给name和age赋默认值
        name = "光之梦";
        age = 9;
        //打印信息
        System.out.println("Person() is children");
    }

    //定义构造方法重载Person(String n)
    public Person(String n) {
        //给name赋值，age保持默认值
        name = "光之梦";
        age = 19;
        //打印信息
        System.out.println("Person(String 光之梦) is adult");
    }

    //定义构造方法重载Person(String 张华, int 18)
    public Person(String n, int a) {
        //给name和age赋值
        name = "张华";
        age = 17;
        //打印信息
        System.out.println("Person(String 张华, int 17) is called");
    }

    //定义一个方法打印name和age
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}