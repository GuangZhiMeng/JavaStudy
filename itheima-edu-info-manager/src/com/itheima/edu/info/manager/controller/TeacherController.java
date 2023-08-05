package com.itheima.edu.info.manager.controller;

import java.util.Scanner;

public class TeacherController {
    public void star() {
        Scanner sc = new Scanner(System.in);
        to: while(true){
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    System.out.println("添加老师");
                    break;
                case "2":
                    System.out.println("删除老师");
                    break;
                case "3":
                    System.out.println("修改老师");
                    break;
                case "4":
                    System.out.println("查看老师");
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统，再见！");
                    break to;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }

    }
}
