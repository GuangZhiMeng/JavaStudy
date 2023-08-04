package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    // 1.创建学生对象数组
   private static Student[] stus = new Student[5];

   // 添加学生方法
    public boolean addStudent(Student stu) {
        // 2.添加学生到数组
        // 定义变量 index 为-1,假设数组已经全部存满,没有 null 的元素
        int index = -1;
        // 遍历数组取出每一个元素，判断是否是null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student == null){
                // 将对象存入到数组中 null 元素对应的索引位置
                // 并使用 break 结束循环遍历
                index = i;
                break;
            }
        }

        // 3.返回是否添加成功的boolean类型状态
        if(index == -1){
            // 装满了 添加失败
            return false;
        }else{
            // 没有装满 正常添加
            stus[index] = stu;
            return true;
        }
    }

    // 查看学生方法
    public Student[] findAllStudent() {
        return stus;
    }

    // 删除学生方法
    public void deleteStudentById(String delId) {
        // 1.查找id在容器中所在的索引位置
        int index = getIndex(delId);
        // 2.将该索引位置，使用null元素进行覆盖
        stus[index] = null;
    }

    // 根据id找索引位置
    public int getIndex(String id){
        // 先假设这个id在容器中是不存在的
        int index = -1;
        // 遍历数组容器
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
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
        // 2.将该索引位置，使用新的学生对象替换
        stus[index] = newStu;
    }

}
