package Jdk8Date;

import java.time.LocalDateTime;

/**
 * JDK8 时间类添加时间的方法
 */
public class Jdk8DateDemo6 {
    public static void main(String[] args) {
        //public LocalDateTime plusYears (long years)   添加或者减去年

        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        LocalDateTime newLocalDateTime = localDateTime.plusYears(1);
        System.out.println(newLocalDateTime);// 2021-11-11T13:14:15

        LocalDateTime newLocalDateTime2 = localDateTime.plusYears(-1);
        System.out.println(newLocalDateTime2);// 2019-11-11T13:14:15
    }
}

