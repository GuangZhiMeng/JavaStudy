package Array;

import domain.Student;

import java.util.ArrayList;

public class DemoArrayListPick {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 创建对象
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",14);
        Student stu3 = new Student("王五",15);

        // 调用add方法，把对象添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 调用方法getlist(),因为getlist()方法会返回一个集合，所以定义一个新集合变量来保存返回的数据
        ArrayList<Student> newlist = getlist(list);
        for (int i = 0; i < newlist.size(); i++) {
           Student stu = newlist.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    // 1.定义方法，方法的形参定义为 ArrayList<Student>list
    public static ArrayList<Student> getlist(ArrayList<Student> list){
        // 2.方法内部定义新集合,准备存储筛选出的学生对象 ArrayList<Student>newList
        ArrayList<Student> newlist = new ArrayList<>();
        // 3.遍历原集合，获取每一个学生对象
        for (int i = 0; i < list.size(); i++){
            // 4.通过学生对象调用 getAge 方法获取年龄
            Student stu = list.get(i);
            int age = stu.getAge();
            // 判断年龄是否低于18
            if (age < 18){
                // 5.将年龄低于 18 的学生对象存入新集合
                newlist.add(stu);
            }
        }
        // 6.返回新集合
        return newlist;
    }
}
