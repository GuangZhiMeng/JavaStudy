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
                    System.out.println("ɾ����ʦ");
                    break;
                case "3":
                    System.out.println("�޸���ʦ");
                    break;
                case "4":
                    System.out.println("�鿴��ʦ");
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
