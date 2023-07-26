package StudentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ����������������
        ArrayList<Student> list = new ArrayList<>();

        lo: while (true){
            // �������˵�
            System.out.println("--------��ӭ����ѧ������ϵͳ--------");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴ѧ��");
            System.out.println("5 �˳�");
            System.out.println("����������ѡ��:");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    //System.out.println("���ѧ��");
                    addStudent(list);
                    break;
                case 2:
                    //System.out.println("ɾ��ѧ��");
                    deleteStudent(list);
                    break;
                case 3:
                    //System.out.println("�޸�ѧ��");
                    updateStudent(list);
                    break;
                case 4:
                    //System.out.println("�鿴ѧ��");
                    findStudent(list);
                    break;
                case 5:
                    System.out.println("��л����ʹ��");
                    break lo;
                default:
                    System.out.println("������������");
                    break;
            }
        }

    }


    // ���ѧ������
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        // 1.����¼�����ʾ��Ϣ
        // �����ӵ�ѧ��ѧ���Ƿ��ظ�������ظ�����������
        String sid;
        while(true){
            System.out.println("������ѧ�ţ�");
            sid = sc.next();

            int index = getIndex(list,sid);
            if(index == -1){
                // sid �����ڣ�ѧ�ſ���ʹ�ã��˳���ѭ��
                break;
            }
        }

        System.out.println("������������");
        String name = sc.next();
        System.out.println("���������䣺");
        int age = sc.nextInt();
        System.out.println("���������գ�");
        String birthday = sc.next();
        // 2.������¼�����Ϣ��װΪѧ������
        Student stu = new Student(sid,name,age,birthday);
        // 3.����װ�õ�ѧ��������ӵ�������������
        list.add(stu);
        // 4.������ӳɹ���������Ϣ
        System.out.println("��ӳɹ�");
    }

    // �鿴ѧ������
    public static void findStudent(ArrayList<Student> list) {
        // 1.�ж��������Ƿ�������,���û�о���ʾ��ʾ��Ϣ
        if (list.size() == 0){
            System.out.println("����Ϣ������Ӻ����²�ѯ");
            return;
        }
        // 2.���ڣ���ʾ��ͷ��Ϣ
        System.out.println("ѧ��\t����\t����\t\t����");
        // 3.�������ϣ���ȡÿһ��ѧ���������Ϣ����ӡ�ڿ���̨
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    // getIndex : ����һ�����϶��󣬽���һ��ѧ��ѧ��
    // �������ѧ�ţ��ڼ����г��ֵ�����λ��
    public static int getIndex(ArrayList<Student> list, String sid){
        // 1.���贫���ѧ�ţ��ڼ����в�����
        int index = -1;
        // 2.�������ϣ���ȡÿһ��ѧ������׼�����в���
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // 3.��ȡÿһ��ѧ�������ѧ��
            String id = stu.getSid();
            // 4.ʹ�û�ȡ����ѧ��ѧ�ţ��ʹ����ѧ�ţ����ҵ�ѧ�ţ����бȶ�
            if (id.equals(sid)){
                // ���ڣ���index������¼��ȷ������λ��
                index = i;
            }
        }
        return index;
    }

    // ɾ��ѧ������
    public static void deleteStudent(ArrayList<Student> list) {
        // ������ʾ��Ϣ
        System.out.println("��������Ҫɾ����ѧ��ѧ�ţ�");
        // ���̽���Ҫɾ����ѧ��
        Scanner sc = new Scanner(System.in);
        String deleteSid = sc.next();
        // ����getIndex���������Ҹ�ѧ���ڼ����г��ֵ�����λ��
        int index = getIndex(list,deleteSid);
        // ���������жϣ�ѧ���ڼ������Ƿ����
        if (index == -1){
            // �����ڣ���������
            System.out.println("������Ϣ������������");
        }else{
            // ���ڣ�ɾ��
            list.remove(index);//��������ɾ��
            System.out.println("ɾ���ɹ���");
        }
    }

    // �޸�ѧ������
    public static void updateStudent(ArrayList<Student> list) {
        // ������ʾ��Ϣ
        System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
        // ���̽���Ҫ�޸ĵ�ѧ��
        Scanner sc = new Scanner(System.in);
        String updateSid = sc.next();
        // ����getIndex���������Ҹ�ѧ���ڼ����г��ֵ�����λ��
        int index = getIndex(list,updateSid);
        // ���������жϣ�ѧ���ڼ������Ƿ����
        if (index == -1){
            // �����ڣ���������
            System.out.println("������Ϣ������������");
        }else{
            // ���ڣ������µ�ѧ����Ϣ
            System.out.println("�������µ�ѧ��������");
            String name = sc.next();
            System.out.println("�������µ�ѧ�����䣺");
            int age = sc.nextInt();
            System.out.println("�������µ�ѧ�����գ�");
            String birthday = sc.next();
            // ��װΪ�µ�ѧ������
            Student stu = new Student(updateSid,name,age,birthday);
            // ���ü��ϵ�set����������޸�
            list.set(index,stu);
            System.out.println("�޸ĳɹ���");
        }
    }
}
