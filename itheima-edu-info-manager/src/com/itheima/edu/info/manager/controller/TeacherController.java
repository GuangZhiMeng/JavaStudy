package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();
    public void star() {

        to: while(true){
            System.out.println("--------��ӭ���� <��ʦ> ����ϵͳ--------");
            System.out.println("����������ѡ��: 1.�����ʦ  2.ɾ����ʦ  3.�޸���ʦ  4.�鿴��ʦ  5.�˳�");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("�����ʦ");
                    addTeacher();
                    break;
                case "2":
                    //System.out.println("ɾ����ʦ");
                    deleteTeacherById();
                    break;
                case "3":
                    //System.out.println("�޸���ʦ");
                    updateTeacher();
                    break;
                case "4":
                    //System.out.println("�鿴��ʦ");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("��л��ʹ����ʦ����ϵͳ���ټ���");
                    break to;
                default:
                    System.out.println("����������������������");
                    break;
            }
        }

    }

    // �޸���ʦ����
    public void updateTeacher() {
        String id;
        while(true){
            System.out.println("��������Ҫ�޸ĵ�id");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if(!exists){
                System.out.println("�������id�����ڣ����������룺");
            }else{//id���ڣ�����ѭ��
                break;
            }

            // ����¼���µ���ʦ��Ϣ
        System.out.println("��������ʦ������");
        String name = sc.next();
        System.out.println("��������ʦ���䣺");
        String age = sc.next();
        System.out.println("��������ʦ���գ�");
        String birthday = sc.next();

        // ��װΪ�µ���ʦ����
        Teacher newTeacher = new Teacher();
        newTeacher.setId(id);
        newTeacher.setName(name);
        newTeacher.setAge(age);
        newTeacher.setBirthday(birthday);

        // ����ҵ��Ա���޸ķ���
        teacherService.updateTeacher(id,newTeacher);

        }
    }

    // ɾ����ʦ����
    public void deleteTeacherById() {
        String id;
        while (true) {
            // 1.���̽���Ҫɾ������ʦid
            System.out.println("��������Ҫɾ����id");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("�������id�����ڣ����������룺");
            } else {
                break;
            }
        }

        // 2.����ҵ��Ա�е�ɾ������������id��ɾ����ʦ
        teacherService.deleteTeacherById(id);

        // 3. ��ʾɾ���ɹ�
        System.out.println("ɾ���ɹ�");
    }

    // �鿴����
    public void findAllTeacher() {
        // 1.��ҵ��Ա�У���ȡ��ʦ��������
        Teacher[] teachers = teacherService.findAllTeacher();

        // 2.�ж��������Ƿ���Ԫ��
        if (teachers == null){
            System.out.println("������Ϣ������Ӻ�����");
            return;
        }

        // 3.�������飬ȡ��Ԫ�أ�����ӡ�ڿ���̨
        System.out.println("ѧ��\t\t����\t����\t����");
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if(t != null){
                System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getAge() + "\t\t" + t.getBirthday());
            }
        }
    }

    // �����ʦ����
    public void addTeacher() {
        String id;
        while (true){
            // 1. ���ܲ����ڵ���ʦid
            System.out.println("��������ʦid��");
            id = sc.next();
            // 2. �ж�id�Ƿ����
            boolean exists = teacherService.isExists(id);

            if(exists){
                System.out.println("��id�ѱ�ռ�ã�����������");
            }else{
                // exists Ϊflase idδ��ռ��
                break;
            }
        }

        // 3.������ʦ��������Ϣ
        System.out.println("��������ʦ������");
        String name = sc.next();
        System.out.println("��������ʦ���䣺");
        String age = sc.next();
        System.out.println("��������ʦ���գ�");
        String birthday = sc.next();

        // 4.��װΪ��ʦ����
        Teacher t = new Teacher();
        t.setId(id);
        t.setName(name);
        t.setAge(age);
        t.setBirthday(birthday);

        // 5.����װ�õ���ʦ���󣬴��ݸ�TeacherService ���������Ӳ���
        boolean result = teacherService.addTeacher(t);

        if(result){
            System.out.println("��ӳɹ�");
        }else{
            System.out.println("���ʧ��");
        }
    }

 }
