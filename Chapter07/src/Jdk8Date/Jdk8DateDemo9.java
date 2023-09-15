package Jdk8Date;

import java.time.LocalDate;
import java.time.Period;

/**
 *  ��������ʱ��ļ��
 */

public class Jdk8DateDemo9 {
    public static void main(String[] args) {
        //public static Period between(��ʼʱ��,����ʱ��)  ��������"ʱ��"�ļ��

        LocalDate localDate1 = LocalDate.of(2020, 1, 1);
        LocalDate localDate2 = LocalDate.of(2048, 12, 12);
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);//P28Y11M11D
        // P��ʾ����Periodһ��ʱ��������28Y��28�꣬11M��11�£�11D��11��

        //public int getYears()         ������ʱ�������
        System.out.println(period.getYears());//28
        //public int getMonths()        ��ô��ڼ������
        System.out.println(period.getMonths());//11
        //public int getDays()          ��ô��ڼ������
        System.out.println(period.getDays());//11

        //public long toTotalMonths()   ��ȡ���ڼ��������
        //toTotalMonths()��������õĿ�ʼʱ�䵽����ʱ�䣬�м�һ����ȥ�˶�����
        System.out.println(period.toTotalMonths());//347
    }
}

