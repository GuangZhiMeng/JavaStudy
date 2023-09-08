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

    // ����
    public Teacher[] findAllTeacher() {
        Teacher[] allTeacher = teacherDao.findAllTeacher();

        boolean flag = false;

        for(int i = 0; i < allTeacher.length; i++) {
            Teacher t = allTeacher[i];
            if(t != null){
                flag = true;
                break;
            }
        }

        if(flag){
            return allTeacher;
        }else{
            return null;
        }
    }

    // ɾ������
    public void deleteTeacherById(String id) {
        teacherDao.deleteTeacherById(id);
    }

    public void updateTeacher(String id, Teacher newTeacher) {
        teacherDao.updateTeacher(id,newTeacher);
    }
}
