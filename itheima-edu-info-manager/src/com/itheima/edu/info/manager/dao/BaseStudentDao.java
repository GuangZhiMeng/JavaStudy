package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public abstract class BaseStudentDao {

   // ���ѧ������
    public abstract boolean addStudent(Student stu);

    // �鿴ѧ������
    public abstract Student[] findAllStudent();

    // ɾ��ѧ������
    public abstract void deleteStudentById(String delId);

    // ����id������λ��
    public abstract int getIndex(String id);

    // �޸�ѧ��������Ϣ
    public abstract void updateStudent(String updateId, Student newStu);

}
