package HeiMaOOP;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // ����Scanner����
        Scanner sc = new Scanner(System.in);
        System.out.println("������������");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("�������ַ�����");
        String s = sc.nextLine();
        System.out.println(s);
    }
}
