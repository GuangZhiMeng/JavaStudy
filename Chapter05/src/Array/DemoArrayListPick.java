package Array;

import domain.Student;

import java.util.ArrayList;

public class DemoArrayListPick {
    public static void main(String[] args) {
        // ��������
        ArrayList<Student> list = new ArrayList<>();

        // ��������
        Student stu1 = new Student("����",18);
        Student stu2 = new Student("����",14);
        Student stu3 = new Student("����",15);

        // ����add�������Ѷ�����ӵ�������
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // ���÷���getlist(),��Ϊgetlist()�����᷵��һ�����ϣ����Զ���һ���¼��ϱ��������淵�ص�����
        ArrayList<Student> newlist = getlist(list);
        for (int i = 0; i < newlist.size(); i++) {
           Student stu = newlist.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    // 1.���巽�����������βζ���Ϊ ArrayList<Student>list
    public static ArrayList<Student> getlist(ArrayList<Student> list){
        // 2.�����ڲ������¼���,׼���洢ɸѡ����ѧ������ ArrayList<Student>newList
        ArrayList<Student> newlist = new ArrayList<>();
        // 3.����ԭ���ϣ���ȡÿһ��ѧ������
        for (int i = 0; i < list.size(); i++){
            // 4.ͨ��ѧ��������� getAge ������ȡ����
            Student stu = list.get(i);
            int age = stu.getAge();
            // �ж������Ƿ����18
            if (age < 18){
                // 5.��������� 18 ��ѧ����������¼���
                newlist.add(stu);
            }
        }
        // 6.�����¼���
        return newlist;
    }
}
