package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            // ����˵�
            System.out.println("--------��ӭ����������Ϣ����ϵͳ--------");
            System.out.println("����������ѡ��: 1.ѧ������  2.��ʦ����  3.�˳�");
            String choice = sc.next();

            switch (choice){
                case "1":
                    // System.out.println("ѧ������");
                    // ����ѧ������ϵͳ
                    // �û����������ҿͷ��Ӵ�Ա
                    StudentController studentController = new StudentController();
                    studentController.star();
                    break;
                case "2":
                    System.out.println("��ʦ����");
                    break;
                case "3":
                    System.out.println("��л����ʹ�ã��ټ�");
                    // �˳���ǰ�������е�JVM�����
                    System.exit(0);
                    break;
                default:
                    System.out.println("����������������������");
                    break;
            }
        }

    }
}
