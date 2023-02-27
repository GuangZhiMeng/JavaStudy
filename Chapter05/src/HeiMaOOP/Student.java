package HeiMaOOP;

// JavaBean类：封装数据
public class Student {
    // 成员方法
    private String name;
    private int age;

    // 构造方法
    public Student(){//无参构造方法

    }

    //带参构造方法
    public Student(String name, int age){
        this.name = name;//用this关键字把形参传给成员变量
        this.age = age;
    }

    // 给每一个成员变量提供set和get方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    // 成员方法
    public void show(){
        System.out.println(name + "..." + age);
    }

}
