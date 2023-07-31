package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    // 1. ����StudentDao����ܣ�
    private StudentDao studentDao = new StudentDao();

    // ���ѧ������
    public boolean addStudent(Student stu) {
        // 2.��ѧ�����󣬴��ݸ�StudentDao����е�addStudent����
        // 3.�����ص�boolean���ͽ����������StudentController
        return studentDao.addStudent(stu);
    }

    // �ж�ѧ���Ƿ���ڷ���
    public boolean isExists(String id){
        Student[] stus = studentDao.findAllStudent();
        // ����id�������в�����
        boolean exists = false;
        // �������飬��ȡÿһ��ѧ������׼�������ж�
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null && student.getId().equals(id)){
                exists = true;// id ����
                break;
            }
        }
        return exists;
    }
}
