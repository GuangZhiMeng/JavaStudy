package MyDate;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
//        public Date()          | ����һ��Date���󣬱�ʾĬ��ʱ��
//        public Date(long date) | ����һ��Date���󣬱�ʾָ��ʱ��

        // ���ʱ���ʾ�����еĵ�ǰʱ��
        Date date1 = new Date();
        System.out.println(date1); //Wed Sep 13 17:57:30 CST 2023

        // �Ӽ������ʱ��ԭ�㿪ʼ������ָ��������Ǹ�ʱ��
        Date date2 = new Date(0L);// ����0����
        System.out.println(date2);// Thu Jan 01 08:00:00 CST 1970
        // ��ʱ��ԭ�㿪ʼ������0����
        // ��Ϊ���������й����������ڶ�������Ҫ+8Сʱ

        // ��ӡ��1970��1��1�� �����9��
        Date date3 = new Date(3600L * 1000);
        System.out.println(date3);// Thu Jan 01 09:00:00 CST 1970
    }
}
