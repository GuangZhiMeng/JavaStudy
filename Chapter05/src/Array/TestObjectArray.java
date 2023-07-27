package Array;

import domain.Student;

public class TestObjectArray {
    public static void main(String[] args) {
        // 动态初始化长度为 3 的数组，类型为 Student 类型
        Student[] arr = new Student[3];
        // 根据需求创建 3 个学生对象
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);
        // 将学生对象存入数组
        arr[0] = stu1;//在对象数组中存储的是对象的内存地址，直接打印的话，打印的也是对象的内存地址
        arr[1] = stu2;
        arr[2] = stu3;
        // 遍历数组，取出每一个学生对象
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]); // domain.Student@1540e19d
            Student temp = arr[i];
            System.out.println(temp.getName() + "..." + temp.getAge());
        }
    }
}
