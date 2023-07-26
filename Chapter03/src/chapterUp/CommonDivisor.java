package chapterUp;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        //输入两个正整数m和n，求其最大公约数和最小公倍数
        //公约数就是可以被同一个数整除的，例如2，3，4是12的公约数。
        //公倍数就是可以整除某些数，就是这些数的公倍数，36是2，3，4，6的公倍数。

        //公约数在[1,m|n]能够同时把m和n都整除的数。
        //公倍数：能同时被m和n整除的数
        //输入
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个正整数m：");
        int m = input.nextInt();
        System.out.print("请输入一个正整数n：");
        int n = input.nextInt();

        //代码优化
        /*
        假设：m = 12，n = 28 从28->1依次判断
        而[12,28]是不可能有它们的公约数，所以这个范围不需要找
        如果能构成[12->1]范围找，更快
        提高效率：先确定m和n的大小关系
        从[m和n中小的那个数开始->1]找，找到的第一个公约数就是他们的最大公约数
         */
    int max = m > n ? m : n;
    int min = m < n ? m : n;
    for(int i=min;i>=1;i--){
        if(m%i==0 && n%i==0){
            System.out.println(i + "是它们的最大公约数");
    //        System.out.println(m*n/i + "是他们的最小公倍数");
            break;
        }
    }

    for(int i=max;i<=m*n;i++){
        if(i%m==0 && i%n==0){
            System.out.println(i + "是它们的最小公倍数");
            break;
        }
    }
    input.close();
    }
}
