package Array;

import domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayListAdd {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<Student> list = new ArrayList<>();

        // ����ѧ������
        Student stu1 = getSudent();//����һ�η������õ�һ��ѧ������
        Student stu2 = getSudent();
        Student stu3 = getSudent();

        // �����������ѧ������
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // ��������
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    public static Student getSudent(){
        // ����¼��ѧ����������Ҫ������
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ��������");
        String name = sc.next();
        System.out.println("������ѧ�����䣺");
        int age = sc.nextInt();

        // ����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
        Student stu = new Student(name,age);

        return  stu;
    }
}
