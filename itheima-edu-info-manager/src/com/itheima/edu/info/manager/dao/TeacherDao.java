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

    public void deleteTeacherById(String id){
        // 1 ��ѯid�������е�����λ��
        int index = getIndex(id);
        // 2.��������λ�õ�Ԫ�أ�ʹ��null�����滻
        teachers[index] = null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if(t != null && t.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    // �޸ķ���
    public void updateTeacher(String id, Teacher newTeacher) {
        int index = getIndex(id);
        teachers[index] = newTeacher;
    }
}
