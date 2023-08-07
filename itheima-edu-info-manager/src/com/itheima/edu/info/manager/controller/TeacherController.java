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
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("添加老师");
                    addTeacher();
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

    // 添加老师方法
    public void addTeacher() {
        String id;
        while (true){
            // 1. 接受不存在的老师id
            System.out.println("请输入老师id：");
            id = sc.next();
            // 2. 判断id是否存在
            boolean exists = teacherService.isExists(id);

            if(exists){
                System.out.println("该id已被占用，请重新输入");
            }else{
                // exists 为flase id未被占用
                break;
            }
        }

        // 3.接受老师的其他信息
        System.out.println("请输入老师姓名：");
        String name = sc.next();
        System.out.println("请输入老师年龄：");
        String age = sc.next();
        System.out.println("请输入老师生日：");
        String birthday = sc.next();

        // 4.封装为老师对象
        Teacher t = new Teacher();
        t.setId(id);
        t.setName(name);
        t.setAge(age);
        t.setBirthday(birthday);

        // 5.将封装好的老师对象，传递给TeacherService 继续完成添加操作
        boolean result = teacherService.addTeacher(t);

        if(result){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

 }
