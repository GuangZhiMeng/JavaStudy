package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    // �����������洢����
    private static Teacher[] teachers = new Teacher[5];

    public boolean addTeacher(Teacher t) {
        int index = -1;// index ����λ��
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if(teacher == null){// �����λ��Ϊ�գ��ǾͰѸ�λ�õ���������index
                index = i;
                break;
            }
        }

        if(index == -1){//װ����
            return false;
        }else{
            teachers[index] = t;
            return true;
        }
    }

    public Teacher[] findAllTeacher() {
        //��������
        return teachers;
    }
}
