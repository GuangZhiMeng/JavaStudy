package Array;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] q = new int[5];

        int sum = 0;
        for (int i = 0; i < q.length; i++){
            System.out.println("请输入第" + (i + 1) + "个整数：");
            q[i] = sc.nextInt();
            sum += q[i];
        }
        System.out.println("Sum = " + sum);
    }
}
