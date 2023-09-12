package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao extends BaseStudentDao{
    // ��������
   private static ArrayList<Student> stus = new ArrayList<>();

   // ���þ�̬������ʼ������ѧ������
   static {
       Student stu1 = new Student("001","����","23","1999-11-11");
       Student stu2 = new Student("007","����","17","2006-07-07");

       // �ѳ�ʼ���õ�ѧ������������
       stus.add(stu1);
       stus.add(stu2);
   }

   // ���ѧ������
    public boolean addStudent(Student stu) {
        // 2.���ѧ��������
       stus.add(stu);
       return true;
    }

    // �鿴ѧ������
    public Student[] findAllStudent() {
        Student[] students = new Student[stus.size()];

        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }

        return students;
    }

    // ɾ��ѧ������
    public void deleteStudentById(String delId) {
        // 1.����id�����������ڵ�����λ��
        int index = getIndex(delId);
        stus.remove(index);
    }

    // ����id������λ��
    public int getIndex(String id){
        // �ȼ������id���������ǲ����ڵ�
        int index = -1;
        // ������������
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
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
        stus.set(index, newStu);
    }

}
