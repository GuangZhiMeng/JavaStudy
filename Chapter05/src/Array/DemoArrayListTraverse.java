package Array;

import domain.Student;

import java.util.ArrayList;

public class DemoArrayListTraverse {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<Student> list = new ArrayList<>();

        // ����ѧ������
        Student stu1 = new Student("����",17);
        Student stu2 = new Student("͹��",16);
        Student stu3 = new Student("��̫",18);

        // ���ѧ�����󵽼�����
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // �������� list.fori
        for(int i = 0; i < list.size();i++){
            Student stu = list.get(i);
           //System.out.println(stu);//domain.Student@1540e19d ���ϴ洢������Щ������ڴ��ַ
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }
}
