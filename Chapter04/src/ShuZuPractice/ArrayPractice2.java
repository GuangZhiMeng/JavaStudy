package ShuZuPractice;

import java.util.Scanner;

/*
2���Ӽ��̽����û��������ĸ�������ظ�����ĳ����ĸ
���ͳ��ÿ��Сд��ĸ���ֵĴ�����
Ҫ��
(1) ����û�������Сд��ĸ��ͳ�����ĸ���������ͳ������ַ�������
(2) ����û�����0�����������
(3) ��������󣬱�����ʾÿ����ĸ���ֵĴ���
��ʾ��
ʹ��һ�����飬����Ϊ26�������洢ÿ����ĸ���ֵĴ���
 */
public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] letterCounts = new int[26];//Ԫ��Ĭ��ֵ��0
        /*
        letterCounts[0]�浽����'a'�Ĵ���
        letterCounts[1]�浽����'b'�Ĵ���
        letterCounts[2]�浽����'c'�Ĵ���
        ����
        letter��Сд��ĸ�Ļ���letterCounts[letter-97]
         */
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("��������ĸ������0��������");
            char letter = input.next().charAt(0);

            if(letter >= 'a' && letter <= 'z'){
                letterCounts[letter-97]++;
            }else if(letter == '0'){//letter == 48
                break;
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            if(letterCounts[i]!=0){
                System.out.println((char)(i + 'a') + ":" + letterCounts[i]);
            }
        }
    }
}
