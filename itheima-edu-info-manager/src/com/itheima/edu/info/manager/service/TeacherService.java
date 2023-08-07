package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();
    public boolean addTeacher(Teacher t) {
        return teacherDao.addTeacher(t);
    }

    // 判断接受到的id在数组中是否存在
    public boolean isExists(String id) {
        // 1，获取库管对象中的数据
        Teacher[] teachers = teacherDao.findAllTeacher();

        boolean exists = false;

        // 2.遍历数组，取出每一个元素，进行判断
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if(teacher != null && teacher.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }
}
