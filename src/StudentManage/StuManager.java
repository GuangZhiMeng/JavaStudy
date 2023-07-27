package StudentManage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuManager {

    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎进入学生管理系统");
        boolean out = false;
        while(true){
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.搜索学生");
            System.out.println("5.显示学生");
            System.out.println("6.学生排序");
            System.out.println("7.退出学生管理系统");
            int nType = scanner.nextInt();

            switch(nType){
                case 1:
                    AddStu();
                    break;
                case 2:
                    DelStu();
                    break;
                case 3:
                    updateStu();
                    break;
                case 4:
                    searchStu();
                    break;
                case 5:
                    showStu();
                    break;
                case 6:
                    sortStu();
                    break;
                case 7:
                    out = true;
                    break;
            }
            if(out){
                break;
            }
        }
    }

    //添加学生
    private static void AddStu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入学号：");
            int num = scanner.nextInt();
            System.out.println("输入姓名：");
            String strName = scanner.next();
            System.out.println("输入年龄：");
            int age = scanner.nextInt();

            Student student = new Student();
            student.setNum(num);
            student.setName(strName);
            student.setAge(age);

            if(Util.getStuListInfo().getaStus().contains(student)){
                System.out.println("存在同学号学生");
                continue;
            }

            Util.getStuListInfo().getaStus().add(student);
            System.out.println("添加学生成功");
            break;
        }
    }

    //删除学生
    private static void DelStu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入学号：");
            int num = scanner.nextInt();
            Student student = new Student();
            student.setNum(num);
            if(Util.getStuListInfo().getaStus().contains(student) == false){
                System.out.println("不存在学生");
                continue;
            }

            ArrayList<Student> uList = Util.getStuListInfo().getaStus();
            for(Student stu : uList){
                if(stu.getNum()==num){
                    uList.remove(stu);
                    System.out.println("删除学生成功");
                    break;
                }
            }
            break;
        }
    }

    //查找学生
    public static void searchStu() {
        boolean bRet = false;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入学号");
            int num = scanner.nextInt();
            Student student = new Student();
            student.setNum(num);

            if (!Util.getStuListInfo().getaStus().contains(student)) {
                System.out.println("不存在学生");
                System.out.println("请重新搜索");
                continue;
            }
            boolean bFind = false;
            ArrayList<Student> uStus = Util.getStuListInfo().getaStus();
            for (Student student2 : uStus) {
                if (student2.getNum() == num) {
                    System.out.print(student2.getNum() + "\t");
                    System.out.print(student2.getName() + "\t");
                    System.out.println(student2.getAge() + "\t");
                    bFind=true;
                    break;
                }
            }
            if(bFind){
                break;
            }
        }
    }

    //修改学生信息
    private static void updateStu(){
        Scanner scanner = new Scanner(System.in);
        boolean nType=false;
        while(true){
            System.out.println("输入学号：");
            int num = scanner.nextInt();

            Student student = new Student();
            student.setNum(num);
            if(Util.getStuListInfo().getaStus().contains(student) == false){
                System.out.println("no存在相同学号的学生");
                System.out.println("请重新查询");
                continue;
            }else {
                System.out.println("学生存在");
            }

            System.out.println("输入new学号： ");
            int newNum = scanner.nextInt();

            System.out.println("输入姓名：");
            String strName = scanner. next();

            System.out.println("输入年龄");
            int age = scanner.nextInt();


            ArrayList<Student> uList = Util.getStuListInfo().getaStus();
            for(Student stu : uList){
                if(stu.getNum()==num){
                    stu.setNum(newNum);
                    stu.setAge(age);

                    stu.setName(strName);
                    System.out.println("修改学生成功");
                    nType = true;
                    break;
                }
            }
            if(nType){
                break;
            }
        }
    }

    //显示学生信息
    private static void showStu(){
        System.out.print("学号\t\t");
        System.out.print("姓名\t\t");
        System.out.println("年龄\t");
        ArrayList<Student> uStudent = Util.getStuListInfo().getaStus();
        for(Student student : uStudent){
            System.out.print(student.getNum()+"\t");
            System.out.print(student.getName()+"\t");
            System.out.println(student.getAge()+"\t");
        }
    }

    //排序学生信息
    private static void sortStu(){
        System.out.println("1.学号升序排序");
        System.out.println("2.学号降序排序");
        Scanner scanner = new Scanner(System.in);
        final int nType = scanner.nextInt();
        ArrayList<Student> uStudent = Util.getStuListInfo().getaStus();
        uStudent.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (nType==1)?(o1.getNum()- o2.getNum()):(o2.getNum()- o1.getNum());
            }
        });
        showStu();
    }
}
