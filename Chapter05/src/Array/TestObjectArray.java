package Array;

import domain.Student;

public class TestObjectArray {
    public static void main(String[] args) {
        // ��̬��ʼ������Ϊ 3 �����飬����Ϊ Student ����
        Student[] arr = new Student[3];
        // �������󴴽� 3 ��ѧ������
        Student stu1 = new Student("����",23);
        Student stu2 = new Student("����",24);
        Student stu3 = new Student("����",25);
        // ��ѧ�������������
        arr[0] = stu1;//�ڶ��������д洢���Ƕ�����ڴ��ַ��ֱ�Ӵ�ӡ�Ļ�����ӡ��Ҳ�Ƕ�����ڴ��ַ
        arr[1] = stu2;
        arr[2] = stu3;
        // �������飬ȡ��ÿһ��ѧ������
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]); // domain.Student@1540e19d
            Student temp = arr[i];
            System.out.println(temp.getName() + "..." + temp.getAge());
        }
    }
}
