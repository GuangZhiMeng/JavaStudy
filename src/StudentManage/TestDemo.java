package StudentManage;


import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("学生管理系统");
            System.out.println("1.进入学生管理系统");
            System.out.println("2.退出");
            System.out.println("请输入1或2进行操作：");
            int nType = scanner.nextInt();

            switch(nType){
                case 1:
                    StuManager.showMenu();
                    break;
                case 2:
                    break;
            }

            if(nType == 1 || nType == 2){
                break;
            }
        }
        scanner.close();
    }
}
