package Jdk8Date;

import java.time.LocalDateTime;

/**
 * JDK8 时间类修改时间
 */
public class Jdk8DateDemo8 {
    public static void main(String[] args) {
        //public LocalDateTime withYear(int year)   修改年
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        LocalDateTime newLocalDateTime = localDateTime.withYear(2048);
        System.out.println(newLocalDateTime); // 2048-11-11T13:14:15

        // 如果传递的参数超出范围，则会报错
//        LocalDateTime newLocalDateTime = localDateTime.withMonth(20);
//        System.out.println(newLocalDateTime);
    }
}
