package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    // 1.����ѧ����������
   private static Student[] stus = new Student[5];

   // ���ѧ������
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

    // �鿴ѧ������
    public Student[] findAllStudent() {
        return stus;
    }

    // ɾ��ѧ������
    public void deleteStudentById(String delId) {
        // 1.����id�����������ڵ�����λ��
        int index = getIndex(delId);
        // 2.��������λ�ã�ʹ��nullԪ�ؽ��и���
        stus[index] = null;
    }

    // ����id������λ��
    public int getIndex(String id){
        // �ȼ������id���������ǲ����ڵ�
        int index = -1;
        // ������������
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null && stu.getId().equals(id)){
                //�ҵ���
                index = i;
                break;
            }
        }
        return index;
    }

    // �޸�ѧ��������Ϣ
    public void updateStudent(String updateId, Student newStu) {
        // 1.����updateId���������е�����λ��
        int index = getIndex(updateId);
        // 2.��������λ�ã�ʹ���µ�ѧ�������滻
        stus[index] = newStu;
    }

}
