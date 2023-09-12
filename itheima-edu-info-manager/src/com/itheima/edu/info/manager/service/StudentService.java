package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    // 1. ����StudentDao����ܣ�
    private OtherStudentDao studentDao = new OtherStudentDao();

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

    // ��ѯ�ڲֿ⣨���飩���Ƿ����ѧ����Ϣ
    public Student[] findAllStudent() {
        //1. ���ÿ�ܶ����findAllStudent��������ȡѧ����������
        Student[] allStudent = studentDao.findAllStudent();

        //2. �ж��������Ƿ���ѧ����Ϣ���У����ص�ַ��û�У�����null��
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if(stu != null){// ������ֻҪ��һ��Ԫ�ز���null���Ǿʹ������������ѧ����Ϣ
                flag = true;
                break;
            }
        }

        if(flag){
            // true ����������Ϣ
            return allStudent;
        }else{
            // û����Ϣ
            return null;
        }
    }

    // ֪ͨ��ܣ�����id�����ɾ��
    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    // ֪ͨ��ܣ��ÿ��������޸�
    public void updateStudent(String updateId, Student newStu) {
        studentDao.updateStudent(updateId,newStu);
    }
}
