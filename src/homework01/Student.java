package homework01;
//声明一个学生类，包含年龄属性，姓名属性，性别属性
public class Student {
    private int age;
    private String name;
    private String gender;

    //定义声明的年龄属性，姓名属性，性别属性
    public Student(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    // 用eat方法输出：xxx正在吃饭
    public void eat() {
        System.out.println(name + "正在吃饭");
    }

    // 用sleep方法输出:xxx正在睡觉
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    // 用study方法输出:xxx正在学习
    public void study() {
        System.out.println(name + "正在学习");
    }
}
