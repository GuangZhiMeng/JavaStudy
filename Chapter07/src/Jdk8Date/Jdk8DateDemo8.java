package Jdk8Date;

import java.time.LocalDateTime;

/**
 * JDK8 ʱ�����޸�ʱ��
 */
public class Jdk8DateDemo8 {
    public static void main(String[] args) {
        //public LocalDateTime withYear(int year)   �޸���
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        LocalDateTime newLocalDateTime = localDateTime.withYear(2048);
        System.out.println(newLocalDateTime); // 2048-11-11T13:14:15

        // ������ݵĲ���������Χ����ᱨ��
//        LocalDateTime newLocalDateTime = localDateTime.withMonth(20);
//        System.out.println(newLocalDateTime);
    }
}
