package Jdk8Date;

import java.time.LocalDateTime;

/**
 * JDK8 ʱ�������ʱ��ķ���
 */
public class Jdk8DateDemo7 {
    public static void main(String[] args) {
        //public LocalDateTime minusYears (long years)  ��ȥ���������
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        //LocalDateTime newLocalDateTime = localDateTime.minusYears(1);
        //System.out.println(newLocalDateTime);

        LocalDateTime newLocalDateTime = localDateTime.minusYears(-1);
        System.out.println(newLocalDateTime); // 2021-11-11T13:14:15
    }
}
