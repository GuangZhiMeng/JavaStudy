package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    // 1. 创建StudentDao（库管）
    private OtherStudentDao studentDao = new OtherStudentDao();

    // 添加学生方法
    public boolean addStudent(Student stu) {
        // 2.将学生对象，传递给StudentDao库管中的addStudent方法
        // 3.将返回的boolean类型结果，返还给StudentController
        return studentDao.addStudent(stu);
    }

    // 判断学号是否存在方法
    public boolean isExists(String id){
        Student[] stus = studentDao.findAllStudent();
        // 假设id在数组中不存在
        boolean exists = false;
        // 遍历数组，获取每一个学生对象，准备进行判断
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null && student.getId().equals(id)){
                exists = true;// id 存在
                break;
            }
        }
        return exists;
    }

    // 查询在仓库（数组）中是否存在学生信息
    public Student[] findAllStudent() {
        //1. 调用库管对象的findAllStudent方法，获取学生对象数组
        Student[] allStudent = studentDao.findAllStudent();

        //2. 判断数组中是否有学生信息（有：返回地址，没有：返回null）
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if(stu != null){// 数组中只要有一个元素不是null，那就代表这个数组有学生信息
                flag = true;
                break;
            }
        }

        if(flag){
            // true 数组中有信息
            return allStudent;
        }else{
            // 没有信息
            return null;
        }
    }

    // 通知库管，根据id来完成删除
    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    // 通知库管，让库管来完成修改
    public void updateStudent(String updateId, Student newStu) {
        studentDao.updateStudent(updateId,newStu);
    }
}
