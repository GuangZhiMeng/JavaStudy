package string;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String s = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if (c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >= '0' && c <= '9'){
                numCount++;
            }
        }

        //
        System.out.println("��д��ĸ�ַ��У�" + bigCount + "��");
        //System.out.printf("��д��ĸ�ַ��У�%d\n",bigCount);
        System.out.println("Сд��ĸ�ַ��У�" + smallCount + "��");
        System.out.println("�����ַ��У�" + numCount + "��");
    }
}
