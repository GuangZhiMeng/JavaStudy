package Jdk8Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Jdk8DateDemo5 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        //public static LocalDateTime parse (׼���������ַ���, ������ʽ) ��һ�������ַ���������Ϊһ��LocalDateTime����
        String s = "2020��11��12�� 13:14:15";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, pattern);
        System.out.println(parse); //2020-11-12T13:14:15
    }

    private static void method1() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 12, 13, 14, 15);
        System.out.println(localDateTime); //2020-11-12T13:14:15
        //public String format (ָ����ʽ)   ��һ��LocalDateTime��ʽ����Ϊһ���ַ���
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss");
        String s = localDateTime.format(pattern);
        System.out.println(s); //2020��11��12�� 13:14:15
    }
}

