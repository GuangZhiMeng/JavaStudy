package Jdk8Date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class Jdk8DateDemo3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 9, 13, 21, 50, 20);
        //public int getYear()           ��ȡ��
        int year = localDateTime.getYear();
        System.out.println("��Ϊ" +year); //��Ϊ2023

        //public int getMonthValue()     ��ȡ�·ݣ�1-12��
        int month = localDateTime.getMonthValue();
        System.out.println("�·�Ϊ" + month); //�·�Ϊ9

        Month month1 = localDateTime.getMonth();
//        System.out.println(month1);

        //public int getDayOfMonth()     ��ȡ�·��еĵڼ��죨1-31��
        int day = localDateTime.getDayOfMonth();
        System.out.println("����Ϊ" + day); //����Ϊ13

        //public int getDayOfYear()      ��ȡһ���еĵڼ��죨1-366��
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("����һ���еĵ�" + dayOfYear + "��"); //����һ���еĵ�256��

        //public DayOfWeek getDayOfWeek()��ȡ����
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("����Ϊ" + dayOfWeek); //����ΪWEDNESDAY

        //public int getMinute()        ��ȡ����
        int minute = localDateTime.getMinute();
        System.out.println("����Ϊ" + minute); //����Ϊ50

        //public int getHour()           ��ȡСʱ
        int hour = localDateTime.getHour();
        System.out.println("СʱΪ" + hour); //СʱΪ21
    }
}
