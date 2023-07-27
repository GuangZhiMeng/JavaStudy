package Array;

import domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayListAdd {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> list = new ArrayList<>();

        // 创建学生对象
        Student stu1 = getSudent();//调用一次方法能拿到一次学生对象
        Student stu2 = getSudent();
        Student stu3 = getSudent();

        // 往集合中添加学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    public static Student getSudent(){
        // 键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student stu = new Student(name,age);

        return  stu;
    }
}
