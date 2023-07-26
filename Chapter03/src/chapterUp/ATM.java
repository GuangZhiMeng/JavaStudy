package chapterUp;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
//        声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
//        ---------ATM-------
//          1、存款
//          2、取款
//          3、显示余额
//          4、退出
//        请选择：

        double balance = 0.0;//表示余额
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("---------ATM-------");
            System.out.println("\t1、存款");
            System.out.println("\t2、取款");
            System.out.println("\t3、显示余额");
            System.out.println("\t4、退出");
            System.out.println("请选择：");
            num = input.nextInt();

            switch(num){
                case 1:
                    System.out.println("请输入存款金额：");
                    double money = input.nextDouble();
                    balance += money;
                    break;//结束switch,不是do while
                case 2:
                    System.out.println("请输入取款金额：");
                    money = input.nextDouble();
                    balance -= money;
                    break;//结束switch,不是do while
                case 3:
                    System.out.println("余额：" + balance);
                    break;
            }
        }while(num != 4);
        input.close();
    }
}
