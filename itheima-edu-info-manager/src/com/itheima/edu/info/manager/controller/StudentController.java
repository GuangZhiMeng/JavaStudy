package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    // ����ѧ������ϵͳ����չʾ�˵�
    public void star() {
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
    public String inputStudentId(){
        //1.�����û�Ҫ�����id
        String id;
        while(true){
            // 1.����¼���ѧ��id
            System.out.println("������ѧ��id��");
            id = sc.next();

            // 2.�ж�id���������Ƿ���ڣ���������ڣ�����Ҫһֱ¼��
            // ����StudentServiceҵ��Ա�����е�isExists����,�ж�ѧ���Ƿ���ڣ������������¼��
            boolean exists = studentService.isExists(id);
            if(!exists){
                System.out.println("�������id�����ڣ����������룺");
            }else{//id���ڣ�����ѭ��
                break;
            }
        }
        return id;
    }

    // ����¼��ѧ����Ϣ
    public Student inputStudentInfo(String updateId){
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
    public void updateStudent() {
        //1.�����û�Ҫ�����id
//        String updateId;
//        while(true){
//            // 1.����¼��Ҫɾ����ѧ��id
//            System.out.println("��������Ҫ�޸ĵ�ѧ��id��");
//            updateId = sc.next();
//
//            // 2.�ж�id���������Ƿ���ڣ���������ڣ�����Ҫһֱ¼��
//            // ����StudentServiceҵ��Ա�����е�isExists����,�ж�ѧ���Ƿ���ڣ������������¼��
//            boolean exists = studentService.isExists(updateId);
//            if(!exists){
//                System.out.println("�������id�����ڣ����������룺");
//            }else{//id���ڣ�����ѭ��
//                break;
//            }
//        }

        //�����Ż�
        String updateId = inputStudentId();

//        // ¼���µ�ѧ����Ϣ
//        System.out.println("������ѧ��������");
//        String name = sc.next();
//        System.out.println("������ѧ�����䣺");
//        String age = sc.next();
//        System.out.println("������ѧ�����գ�");
//        String birthday = sc.next();
//
//        // ��ѧ����Ϣ��װΪѧ������
//        Student newStu = new Student();
//        newStu.setId(updateId);
//        newStu.setName(name);
//        newStu.setAge(age);
//        newStu.setBirthday(birthday);

        // �����Ż�
        Student newStu = inputStudentInfo(updateId);

        // ����StudentService�е�updateStudent�������޸�ѧ��������ʾ�޸ĳɹ�
        studentService.updateStudent(updateId,newStu);
        System.out.println("�޸ĳɹ���");
    }

    // ɾ��ѧ��������Ϣ
    public void deleteStudentById() {
//        String delId;
//        while(true){
//            // 1.����¼��Ҫɾ����ѧ��id
//            System.out.println("��������Ҫɾ����ѧ��id��");
//            delId = sc.next();
//
//            // 2.�ж�id���������Ƿ���ڣ���������ڣ�����Ҫһֱ¼��
//            boolean exists = studentService.isExists(delId);
//            if(!exists){
//                System.out.println("�������id�����ڣ����������룺");
//            }else{//id���ڣ�����ѭ��
//                break;
//            }
//        }

        String delId = inputStudentId();

        // 3. ����ҵ��Ա�е�deleteStudentById����id��ɾ��ѧ��
        studentService.deleteStudentById(delId);
        // 4. ��ʾɾ���ɹ�
        System.out.println("ɾ���ɹ�!");
    }

    // ��ʾѧ��������Ϣ
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

//        System.out.println("������ѧ��������");
//        String name = sc.next();
//        System.out.println("������ѧ�����䣺");
//        String age = sc.next();
//        System.out.println("������ѧ�����գ�");
//        String birthday = sc.next();
//
//        // 2.��ѧ����Ϣ��װΪѧ������
//        Student stu = new Student();
//        stu.setId(id);
//        stu.setName(name);
//        stu.setAge(age);
//        stu.setBirthday(birthday);

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
