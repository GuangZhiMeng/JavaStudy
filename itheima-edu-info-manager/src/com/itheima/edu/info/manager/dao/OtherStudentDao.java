package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao extends BaseStudentDao{
    // 集合容器
   private static ArrayList<Student> stus = new ArrayList<>();

   // 利用静态代码块初始化两个学生对象
   static {
       Student stu1 = new Student("001","张三","23","1999-11-11");
       Student stu2 = new Student("007","七七","17","2006-07-07");

       // 把初始化好的学生对象传入数组
       stus.add(stu1);
       stus.add(stu2);
   }

   // 添加学生方法
    public boolean addStudent(Student stu) {
        // 2.添加学生到数组
       stus.add(stu);
       return true;
    }

    // 查看学生方法
    public Student[] findAllStudent() {
        Student[] students = new Student[stus.size()];

        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }

        return students;
    }

    // 删除学生方法
    public void deleteStudentById(String delId) {
        // 1.查找id在容器中所在的索引位置
        int index = getIndex(delId);
        stus.remove(index);
    }

    // 根据id找索引位置
    public int getIndex(String id){
        // 先假设这个id在容器中是不存在的
        int index = -1;
        // 遍历数组容器
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if(stu != null && stu.getId().equals(id)){
                //找到了
                index = i;
                break;
            }
        }
        return index;
    }

    // 修改学生对象信息
    public void updateStudent(String updateId, Student newStu) {
        // 1.查找updateId，在容器中的索引位置
        int index = getIndex(updateId);
        stus.set(index, newStu);
    }

}
