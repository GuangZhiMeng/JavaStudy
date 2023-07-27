package Random;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        //随机产生100以内的数，猜这个数
        //随机数：Math.random()
        // double num = Math.random(); // [0,1)的小数

        // 1.准备Random 和Scanner对象，分别用于产生随机数和键盘录入
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // 2.使用Random产生一个1~100之间的数，作为要猜的数
        int randNum = (int)(Math.random() * 100);
        //int randNum = r.nextInt(100) + 1;
        //int randNum = (int)(Math.random(100) + 1);

        // 3.循环输入
        int cnt = 0;
        while(true){
            // 4.键盘录入用户猜的数据
            System.out.println("请输入您猜的数据：");
            int num = sc.nextInt();
            System.out.println(randNum);//显示随机数
            cnt++;

            // 5.使用用户录入的数据和随机数进行比较，并给出提示
            if (num > randNum){
                System.out.println("猜大了");
            }else if (num < randNum) {
                System.out.println("猜小了");
            }else{
                // 6.猜对之后，break结束（跳出死循环）
                if(cnt < 5){
                    System.out.printf("恭喜你,只用了%d次就猜对了\n",cnt);
                }else{
                    System.out.printf("恭喜你猜对了！用了%d次\n",cnt);
                }
                break;
            }
        }
        System.out.println("感谢您的使用");
    }
}

