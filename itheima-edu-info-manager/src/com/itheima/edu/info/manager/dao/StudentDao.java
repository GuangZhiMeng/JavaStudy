package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    // 1.����ѧ����������
   private Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        // 2.���ѧ��������
        // ������� index Ϊ-1,���������Ѿ�ȫ������,û�� null ��Ԫ��
        int index = -1;
        // ��������ȡ��ÿһ��Ԫ�أ��ж��Ƿ���null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student == null){
                // ��������뵽������ null Ԫ�ض�Ӧ������λ��
                // ��ʹ�� break ����ѭ������
                index = i;
                break;
            }
        }

        // 3.�����Ƿ���ӳɹ���boolean����״̬
        if(index == -1){
            // װ���� ���ʧ��
            return false;
        }else{
            // û��װ�� �������
            stus[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stus;
    }
}
