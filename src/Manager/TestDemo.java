package Manager;


import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1.管理员登录入口");
            System.out.println("2.管理员注册删除修改查询操作入口");
            System.out.println("3.退出");
            System.out.println("请输入1、2、3进行操作：");
            int nType = scanner.nextInt();

            switch(nType){
                case 1:
                    Login.login();
                    break;
                case 2:
                    UserManager.showMenu();
                    break;
                case 3:
                    break;
            }

            if(nType == 1 || nType == 2){
                break;
            }
        }
        scanner.close();
    }
}
