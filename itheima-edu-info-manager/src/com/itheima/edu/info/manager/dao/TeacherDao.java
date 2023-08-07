package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    // 创建数组来存储数据
    private static Teacher[] teachers = new Teacher[5];

    public boolean addTeacher(Teacher t) {
        int index = -1;// index 索引位置
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if(teacher == null){// 如果该位置为空，那就把该位置的索引赋给index
                index = i;
                break;
            }
        }

        if(index == -1){//装满了
            return false;
        }else{
            teachers[index] = t;
            return true;
        }
    }

    public Teacher[] findAllTeacher() {
        //返回数组
        return teachers;
    }
}
