package algorithm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

//        int j = n - 1;
//        while (j -- > 0){
//            x[j] = sc.nextInt();
//        }

         for (int i = 0; i < n; i++){
             x[i] = sc.nextInt();
         }

        int min = 0;
        for (int i = 0; i < n; i++){
            if (x[i] < x[min]){
                min = i;
            }
        }

        System.out.printf("Minimum value: %d\n",x[min]);
        System.out.printf("Position: %d\n",min);
    }
}
