package java01.idea;

import homework01.Student;
// ����һ��ѧ�������������ѧ������������������Ա����Ե��ö����eat������sleep������study����
public class Main {
    public static void main(String[] args) {
        Student student = new Student(18, "С��", "��");
        student.eat();
        student.sleep();
        student.study();
    }
}
