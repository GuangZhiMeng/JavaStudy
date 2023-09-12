package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public abstract class BaseStudentDao {

   // 添加学生方法
    public abstract boolean addStudent(Student stu);

    // 查看学生方法
    public abstract Student[] findAllStudent();

    // 删除学生方法
    public abstract void deleteStudentById(String delId);

    // 根据id找索引位置
    public abstract int getIndex(String id);

    // 修改学生对象信息
    public abstract void updateStudent(String updateId, Student newStu);

}
