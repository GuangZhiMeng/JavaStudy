package Jdk8Date;

import java.time.LocalDateTime;

public class Jdk8DateDemo2 {
    public static void main(String[] args) {
// public static LocalDateTime now()                         | 获取当前系统时间
// public static LocalDateTime of  (年, 月 , 日, 时, 分, 秒) | 使用指定年月日和时分秒初始化一个LocalDateTime对象 |
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2023-09-13T21:38:47.503

        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 11, 11, 11);
        System.out.println(localDateTime);//2020-11-11T11:11:11
    }
}
