package java01.idea;

import homework01.Student;
// 定义一个学生对象，设置这个学生对象的年龄姓名、性别、属性调用对象的eat方法，sleep方法，study方法
public class Main {
    public static void main(String[] args) {
        Student student = new Student(18, "小杰", "男");
        student.eat();
        student.sleep();
        student.study();
    }
}
