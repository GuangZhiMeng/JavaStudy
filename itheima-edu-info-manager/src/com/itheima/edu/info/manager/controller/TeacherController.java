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
                    //System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    //System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
                    //System.out.println("查看老师");
                    findAllTeacher();
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

    // 修改老师方法
    public void updateTeacher() {
        String id;
        while(true){
            System.out.println("请输入您要修改的id");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if(!exists){
                System.out.println("您输入的id不存在，请重新输入：");
            }else{//id存在，跳出循环
                break;
            }

            // 键盘录入新的老师信息
        System.out.println("请输入老师姓名：");
        String name = sc.next();
        System.out.println("请输入老师年龄：");
        String age = sc.next();
        System.out.println("请输入老师生日：");
        String birthday = sc.next();

        // 封装为新的老师对象
        Teacher newTeacher = new Teacher();
        newTeacher.setId(id);
        newTeacher.setName(name);
        newTeacher.setAge(age);
        newTeacher.setBirthday(birthday);

        // 调用业务员的修改方法
        teacherService.updateTeacher(id,newTeacher);

        }
    }

    // 删除老师方法
    public void deleteTeacherById() {
        String id;
        while (true) {
            // 1.键盘接受要删除的老师id
            System.out.println("请输入您要删除的id");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("您输入的id不存在，请重新输入：");
            } else {
                break;
            }
        }

        // 2.调用业务员中的删除方法，根据id，删除老师
        teacherService.deleteTeacherById(id);

        // 3. 提示删除成功
        System.out.println("删除成功");
    }

    // 查看方法
    public void findAllTeacher() {
        // 1.从业务员中，获取老师对象数组
        Teacher[] teachers = teacherService.findAllTeacher();

        // 2.判断数组中是否有元素
        if (teachers == null){
            System.out.println("查无信息，请添加后重试");
            return;
        }

        // 3.遍历数组，取出元素，并打印在控制台
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if(t != null){
                System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getAge() + "\t\t" + t.getBirthday());
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
