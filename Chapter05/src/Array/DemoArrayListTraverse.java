package Array;

import domain.Student;

import java.util.ArrayList;

public class DemoArrayListTraverse {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> list = new ArrayList<>();

        // 创建学生对象
        Student stu1 = new Student("六花",17);
        Student stu2 = new Student("凸守",16);
        Student stu3 = new Student("勇太",18);

        // 添加学生对象到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 遍历集合 list.fori
        for(int i = 0; i < list.size();i++){
            Student stu = list.get(i);
           //System.out.println(stu);//domain.Student@1540e19d 集合存储的是这些对象的内存地址
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }
}
