package YiChang;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        //1.��� try ��û���������⣬��ôִ�У� --- ���try�����еĴ���ȫ��ִ�����,����ִ��catch����Ĵ���
        //2.��� try �����������⣬��ô try ����Ĵ��뻹��ִ����
        //��ôֱ����ת����Ӧ��catch�����,try����Ĵ���Ͳ�����ִ����
        //��catch��������ȫ��ִ�����,��ʾ������ϵȫ��ִ����ȫ,����ִ������Ĵ���
        //3.������ֵ�����û�б�������ô����������У�
        //��ôtry...catch���൱��û��д.��ôҲ�����Լ�û�д���.
        //Ĭ�Ͻ������������.
        //4.ͬʱ�п��ܳ��ֶ���쳣��ô����
        //���ֶ���쳣,��ô��д���catch�Ϳ�����.
        //ע���:�������쳣֮������Ӹ����ϵ.��ô����һ��Ҫд������

        // method1();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("�������������");
            String line = sc.nextLine();
            int age = Integer.parseInt(line);//��ʽ���쳣
            System.out.println(age);
            System.out.println(2 / 0); //��ѧ�쳣
        } catch (Exception e) {
            //�Ժ����������ÿ�ֲ�ͬ���쳣,�п��ܻ��в�ͬ�Ĵ�����.
        }
        System.out.println("����456");
    }

    private static void method1() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("�������������");
            String line = sc.nextLine();
            int age = Integer.parseInt(line);//��ʽ���쳣
            System.out.println(age);
            System.out.println(2 / 0); //��ѧ�쳣
        } catch (NumberFormatException e) {
            System.out.println("��ʽ���쳣������");
        }catch (ArithmeticException e) {
            System.out.println("��ѧ�����쳣������");
        }
        System.out.println("����456");
    }
}
