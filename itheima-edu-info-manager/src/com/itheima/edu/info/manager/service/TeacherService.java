package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();
    public boolean addTeacher(Teacher t) {
        return teacherDao.addTeacher(t);
    }

    // �жϽ��ܵ���id���������Ƿ����
    public boolean isExists(String id) {
        // 1����ȡ��ܶ����е�����
        Teacher[] teachers = teacherDao.findAllTeacher();

        boolean exists = false;

        // 2.�������飬ȡ��ÿһ��Ԫ�أ������ж�
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
