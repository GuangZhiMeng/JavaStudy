package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    // ����ѧ������ϵͳ����չʾ�˵�
    public final void star() {
        //Scanner sc = new Scanner(System.in);
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
                    //System.out.println("ɾ��");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("�޸�");
                    updateStudent();
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

    // ����¼��ѧ��id
    public abstract String inputStudentId();

    // ����¼��ѧ����Ϣ
    public final Student inputStudentInfo(String updateId){
        // ¼���µ�ѧ����Ϣ
        System.out.println("������ѧ��������");
        String name = sc.next();
        System.out.println("������ѧ�����䣺");
        String age = sc.next();
        System.out.println("������ѧ�����գ�");
        String birthday = sc.next();

        // ��ѧ����Ϣ��װΪѧ������
        Student newStu = new Student();
        newStu.setId(updateId);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birthday);

        return newStu;
    }

    // �޸�ѧ������
    public final void updateStudent() {

        //�����Ż�
        String updateId = inputStudentId();

        // �����Ż�
        Student newStu = inputStudentInfo(updateId);

        // ����StudentService�е�updateStudent�������޸�ѧ��������ʾ�޸ĳɹ�
        studentService.updateStudent(updateId,newStu);
        System.out.println("�޸ĳɹ���");
    }

    // ɾ��ѧ��������Ϣ
    public final void deleteStudentById() {

        String delId = inputStudentId();

        // 3. ����ҵ��Ա�е�deleteStudentById����id��ɾ��ѧ��
        studentService.deleteStudentById(delId);
        // 4. ��ʾɾ���ɹ�
        System.out.println("ɾ���ɹ�!");
    }

    // ��ʾѧ��������Ϣ
    public final void findAllStudent() {

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
    public final void addStudent() {
        //�Ѷ���Ĵ�����ȡ����Ա������λ��
        //StudentService studentService = new StudentService();

        // 1.���̽���ѧ����Ϣ
        //Scanner sc = new Scanner(System.in);
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


        // �����Ż�
        Student stu = inputStudentInfo(id);

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
