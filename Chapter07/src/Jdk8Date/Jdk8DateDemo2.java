package Jdk8Date;

import java.time.LocalDateTime;

public class Jdk8DateDemo2 {
    public static void main(String[] args) {
// public static LocalDateTime now()                         | ��ȡ��ǰϵͳʱ��
// public static LocalDateTime of  (��, �� , ��, ʱ, ��, ��) | ʹ��ָ�������պ�ʱ�����ʼ��һ��LocalDateTime���� |
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2023-09-13T21:38:47.503

        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 11, 11, 11);
        System.out.println(localDateTime);//2020-11-11T11:11:11
    }
}
