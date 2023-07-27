package Manager;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    public static void showMenu(){
        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.println("1.添加管理员");
            System.out.println("2.删除管理员");
            System.out.println("3.查找管理员");
            System.out.println("4.修改管理员");
            System.out.println("5.显示管理员");
            System.out.println("6.返回管理员");
            System.out.println("请输入数字进行操作：");
            int nType = scanner.nextInt();

            switch (nType) {
                case 1:
                    AddUser();
                    break;
                case 2:
                    DelUser();
                    break;
                case 3:
                    searchUser();
                    break;
                case 4:
                    updateUser();
                    break;
                case 5:
                    saveUser();
                    showUser();
                    break;
                case 6:
                    break;
                default:
                    break;
            }
            break;
        }
        scanner.close();
    }

    //添加用户方法
    public static boolean AddUser(){
        boolean bRet = false;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入用户名");
            String strName = scanner.next();
            System.out.println("输入密码");
            String strPwd = scanner.next();
            if(Util.checkSameUserName(strName)){
                System.out.println("存在同名用户：");
                continue;
            }

            User user = new User();
            user.setName(strName);
            user.setPwd(strPwd);

            Util.getUserListInfo().getaUsers().add(user);
            System.out.println("添加用户成功");
            break;
        }
        scanner.close();
        return bRet;
    }

    //删除用户方法
    public static boolean DelUser(){
        boolean bRet = false;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入用户名：");
            String strName = scanner.next();
            if(Util.checkSameUserName(strName)==false){
                System.out.println("不存在用户名");
                continue;
            }
            boolean bDel = false;
            ArrayList<User> uList = Util.getUserListInfo().getaUsers();
            for(User user2 : uList){
                if(user2.getName().equals(strName)){
                    uList.remove(user2);
                    System.out.println("删除用户成功");
                    bDel = true;
                    break;
                }
            }
            if(bDel){
                break;
            }
        }
        scanner.close();
        return bRet;
    }

    //添加搜索用户方法
    public static boolean searchUser(){
        boolean bRet = false;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入用户名：");
            String strName = scanner.next();
            if(Util.checkSameUserName(strName)==false){
                System.out.println("不存在用户名");
                continue;
            }
            boolean bFind = false;
            ArrayList<User> uList = Util.getUserListInfo().getaUsers();
            for(User user2:uList){
                if(user2.getName().equals(strName)){
                    System.out.println("用户名："+user2.getName());
                    System.out.println("密码："+user2.getPwd());
                    bFind = true;
                    break;
                }
            }
            if(bFind){
                break;
            }
        }
        scanner.close();
        return bRet;
    }

    //添加一个修改用户方法
    public static boolean updateUser(){
        boolean bRet = false;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入用户名：");
            String strName = scanner.next();
            if(Util.checkSameUserName(strName)==false){
                System.out.println("不存在用户名");
                continue;
            }

            System.out.println("new 用户名");
            String strNewName = scanner.next();
            System.out.println("输入new密码");
            String strPwd = scanner.next();

            boolean bFind = false;
            ArrayList<User> uList = Util.getUserListInfo().getaUsers();
            for(User user2 : uList){
                if(user2.getName().equals(strName)){
                    user2.setName(strNewName);
                    user2.setPwd(strPwd);
                    bFind = true;
                    break;
                }
            }
            if(bFind){
                System.out.println("修改成功");
                break;
            }
        }
        scanner.close();
        return bRet;
    }

    //添加显示管理员用户
    public static void showUser(){
        System.out.print("用户名\t");
        System.out.println("密码\t");
        ArrayList<User> uList = Util.getUserListInfo().getaUsers();
        for(User user2 : uList){
            System.out.print(user2.getName()+"\t\t");
            System.out.print(user2.getPwd()+"\t\t");
            System.out.println(" ");
        }
    }

    //添加用户信息保存到文件
    public static void saveUser(){
        UserListInfo userListInfo = Util.getUserListInfo();
        Gson gson = new Gson();
        String strJSON = gson.toJson(userListInfo);
        File file = new File("./users.json");
        if(file.exists()==false){
            try{
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(file);
            fileWriter.write(strJSON);
            fileWriter.flush();
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
