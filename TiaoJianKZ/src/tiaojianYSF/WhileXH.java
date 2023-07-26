package tiaojianYSF;

import java.util.Scanner;

public class WhileXH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入n:");
        int n = input.nextInt();
        int n2 = n;
        int s = 1;

        while(n > 0){
            s = s * 2;
            n--;
        }
        System.out.println("2^"+n2+"="+s);
    }
}
