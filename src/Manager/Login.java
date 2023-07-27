package Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入用户名（本人姓名）：");
            String strName = scanner.next();

            System.out.println("输入密码（本人学号）：");
            String strPwd = scanner.next();

            ArrayList<User> aUsers = Util.getUserListInfo().getaUsers();
            User user = new User();
            user.setName(strName);
            user.setPwd(strPwd);
            boolean bContain = aUsers.contains(user);
            if (bContain){
                scanner.close();
                System.out.println("管理员登录成功");
                return;
            }else{
                System.out.println("管理员用户名和密码有误，请重新输入管理员用户名和密码");
            }
        }
    }
}
