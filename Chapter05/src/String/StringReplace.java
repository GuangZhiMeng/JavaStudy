package String;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        // ����һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����Ҫ˵�Ļ���");
        String talk = sc.nextLine();

        // �滻���д�
        String result = talk.replace("TMD","***");

        // ������
        System.out.println(result);
    }
}
