package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    // ����ѧ������ϵͳ����չʾ�˵�
    public void star() {
        Scanner sc = new Scanner(System.in);
        to:while(true){
            System.out.println("--------��ӭ���� <ѧ��> ����ϵͳ--------");
            System.out.println("����������ѡ��: 1.���ѧ��  2.ɾ��ѧ��  3.�޸�ѧ��  4.�鿴ѧ��  5.�˳�");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("���");
                    addStudent();
                    break;
                case "2":
                    System.out.println("ɾ��");
                    break;
                case "3":
                    System.out.println("�޸�");
                    break;
                case "4":
                    //System.out.println("��ѯ");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("��л��ʹ��ѧ������ϵͳ���ټ���");
                    break to;
                default:
                    System.out.println("����������������������");
                    break;
            }
        }
    }

    public void findAllStudent() {
        //��������ڿͷ����б�д�ģ��ͷ���Ҫ��ҵ��Ա��StudentService��ȥҪ�����������
        //�����ڸ÷����������Ҫ����һ��studentServiceҵ��Ա����
        //����ͬһ���൱���ڶ�������д�������ͬ�Ķ����е��˷��ڴ�
        //�Ѷ���Ĵ�����ȡ����Ա������λ��
        //StudentService studentService = new StudentService();

        //1. ͨ��ҵ��Ա��������������ķ������õ�ѧ���Ķ�������
        Student[] stus = studentService.findAllStudent();

        //2. �ж�������ڴ��ַ���Ƿ�Ϊnull
        if(stus == null){
            System.out.println("������Ϣ������Ӻ�����");
            return;
        }

        //3. �������飬��ȡѧ����Ϣ����ӡ�ڿ���̨
        System.out.println("ѧ��\t����\t\t����\t\t����");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            // �ж�һ��ȡ������ѧ����Ϣ�ǲ���null
            // ��Ϊ�����õ��������������鲻һ����װ���ģ��е�λ���ǿյ�Ҳ����null
            // ����Ҫ���жϵ�ǰλ�õ�Ԫ���ǲ���null
            if(stu != null){
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }

    }

    // ���ѧ��
    public void addStudent() {
        //�Ѷ���Ĵ�����ȡ����Ա������λ��
        //StudentService studentService = new StudentService();
        // 1.���̽���ѧ����Ϣ
        Scanner sc = new Scanner(System.in);
        String id;
        // ����ѧԱ id ���жϵĴ��룬ʹ������ѭ������ֱ�������˲����ڵ� id������ѭ��
        while(true){
            System.out.println("������ѧ��id��");
            id = sc.next();
            // ָ�� StudentService ���ж� id �Ƿ���ڵ����ڲ� isExists ����
            // �÷������� boolean ���� true������ false��������
            boolean flag = studentService.isExists(id);
            if(flag){
                System.out.println("ѧ���ѱ�ռ�ã�����������");
            }else{
                break;
            }
        }
        System.out.println("������ѧ��������");
        String name = sc.next();
        System.out.println("������ѧ�����䣺");
        String age = sc.next();
        System.out.println("������ѧ�����գ�");
        String birthday = sc.next();

        // 2.��ѧ����Ϣ��װΪѧ������
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);

        // 3.��ѧ�����󴫵ݸ�StudentService��ҵ��Ա���е�addStudent����
        boolean result = studentService.addStudent(stu);

        // 4.���ݷ��ص�boolean���ͽ�����ڿ���̨�д�ӡ���ɹ�/ʧ��
        if(result){
            System.out.println("��ӳɹ�");
        }else {
            System.out.println("���ʧ��");
        }
    }
}
