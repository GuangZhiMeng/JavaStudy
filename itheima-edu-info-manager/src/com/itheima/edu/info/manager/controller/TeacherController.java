package com.itheima.edu.info.manager.controller;

import java.util.Scanner;

public class TeacherController {
    public void star() {
        Scanner sc = new Scanner(System.in);
        to: while(true){
            System.out.println("--------��ӭ���� <��ʦ> ����ϵͳ--------");
            System.out.println("����������ѡ��: 1.�����ʦ  2.ɾ����ʦ  3.�޸���ʦ  4.�鿴��ʦ  5.�˳�");
            String choice = sc.next();
            switch (choice){
                case "1":
                    System.out.println("�����ʦ");
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
}
