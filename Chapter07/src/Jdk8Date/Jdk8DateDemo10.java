package Jdk8Date;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *  ��������ʱ��ļ��
 */

public class Jdk8DateDemo10 {
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 1, 1, 13, 14, 15);
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 1, 2, 11, 12, 13);
        //public static Duration between(��ʼʱ��,����ʱ��)  ����������ʱ��"�ļ��
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration);//PT21H57M58S
        //public long toSeconds()	       ��ô�ʱ��������
        //System.out.println(duration.toSeconds());//79078
        //public int toMillis()	           ��ô�ʱ�����ĺ���
        System.out.println(duration.toMillis());//79078000
        //public int toNanos()             ��ô�ʱ����������
        System.out.println(duration.toNanos());//79078000000000
    }
}
