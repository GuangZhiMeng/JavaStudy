package string;

import java.util.Scanner;

public class StringLogin {
    public static void main(String[] args) {
        String name1 = "光之梦";
        String pas1 = "777";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=3; i++) {
            System.out.println("请输入用户名：");
            String name2 = sc.nextLine();
            System.out.println("请输入密码：");
            String pas2 = sc.nextLine();
            if(name2.equals(name1) && pas2.equals(pas1)){
                System.out.println("登录成功");
                break;
            }else {
                if (i == 3){
                    System.out.println("登录失败,您的登录次数已达今日上限，请明天再来");
                }else {
                    System.out.println("登录失败，您还剩下" + (3-i) + "次机会");
                }
            }
        }

    }
}
