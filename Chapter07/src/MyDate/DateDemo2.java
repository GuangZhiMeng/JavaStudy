package MyDate;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        // public long getTime()��ȡʱ�����ĺ���ֵ
        // public void setTime(long time)����ʱ�䣬�����Ǻ���ֵ

        // method1();
        Date date1 = new Date();
        date1.setTime(0L);
        System.out.println(date1);

    }

    private static void method1(){
        // �ѵ�ǰʱ���װ��һ��date����
        Date date1 = new Date();
        // ��ȡ���date����ĺ���ֵ --- ��ȡ��ǰʱ��ĺ���ֵ
        long time = date1.getTime();
        System.out.println(time);

        long time2 = System.currentTimeMillis();
        System.out.println(time2);
    }
}
