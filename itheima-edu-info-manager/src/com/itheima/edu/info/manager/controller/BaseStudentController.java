package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    // 开启学生管理系统，并展示菜单
    public final void star() {
        //Scanner sc = new Scanner(System.in);
        to:while(true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("查询");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您使用学生管理系统，再见！");
                    break to;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

    // 键盘录入学生id
    public abstract String inputStudentId();

    // 键盘录入学生信息
    public final Student inputStudentInfo(String updateId){
        // 录入新的学生信息
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();

        // 将学生信息封装为学生对象
        Student newStu = new Student();
        newStu.setId(updateId);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birthday);

        return newStu;
    }

    // 修改学生方法
    public final void updateStudent() {

        //代码优化
        String updateId = inputStudentId();

        // 代码优化
        Student newStu = inputStudentInfo(updateId);

        // 调用StudentService中的updateStudent方法，修改学生，并提示修改成功
        studentService.updateStudent(updateId,newStu);
        System.out.println("修改成功！");
    }

    // 删除学生对象信息
    public final void deleteStudentById() {

        String delId = inputStudentId();

        // 3. 调用业务员中的deleteStudentById根据id，删除学生
        studentService.deleteStudentById(delId);
        // 4. 提示删除成功
        System.out.println("删除成功!");
    }

    // 显示学生对象信息
    public final void findAllStudent() {

        //1. 通过业务员对象来调用里面的方法，得到学生的对象数组
        Student[] stus = studentService.findAllStudent();

        //2. 判断数组的内存地址，是否为null
        if(stus == null){
            System.out.println("查无信息，请添加后重试");
            return;
        }

        //3. 遍历数组，获取学生信息并打印在控制台
        System.out.println("学号\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            // 判断一下取出来的学生信息是不是null
            // 因为我们拿到的这个对象的数组不一定是装满的，有的位置是空的也就是null
            // 所以要先判断当前位置的元素是不是null
            if(stu != null){
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }

    }

    // 添加学生
    public final void addStudent() {
        //把对象的创建提取到成员变量的位置
        //StudentService studentService = new StudentService();

        // 1.键盘接受学生信息
        //Scanner sc = new Scanner(System.in);
        String id;
        // 接收学员 id 和判断的代码，使用无限循环包裹直到输入了不存在的 id，结束循环
        while(true){
            System.out.println("请输入学生id：");
            id = sc.next();
            // 指派 StudentService 中判断 id 是否存在调用内部 isExists 方法
            // 该方法返回 boolean 类型 true：存在 false：不存在
            boolean flag = studentService.isExists(id);
            if(flag){
                System.out.println("学号已被占用，请重新输入");
            }else{
                break;
            }
        }


        // 代码优化
        Student stu = inputStudentInfo(id);

        // 3.将学生对象传递给StudentService（业务员）中的addStudent方法
        boolean result = studentService.addStudent(stu);

        // 4.根据返回的boolean类型结果，在控制台中打印：成功/失败
        if(result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
