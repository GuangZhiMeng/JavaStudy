package Jdk8Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Jdk8DateDemo1 {
    public static void main(String[] args) throws ParseException {
        //JDKMethod();

        // ����һ���ַ���
        String s = "2020��11��11�� 00:00:00";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, pattern);
        LocalDateTime newLocalDateTime = localDateTime.plusDays(1);
        String result = newLocalDateTime.format(pattern);
        System.out.println(result);

    }

    private static void JDKMethod() throws ParseException{
        // ����һ���ַ���
        String s = "2020��11��11�� 00:00:00";

        // ����ʱ���ʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");

        // ��String��ʽ ת�� Date��ʽ����ͨ��getTime()������ȡ����ֵ
        Date date = sdf.parse(s);
        long time = date.getTime();
        // һ��ĺ���ֵ��1000*60*60*24
        time = time + (1000 * 60 * 60 * 24);
        // ����һ��Date���� ʹ��ָ���ĺ���ֵ
        Date newDate = new Date(time);

        // ��ʽ����� Date ת String
        String result = sdf.format(newDate);
        System.out.println(result);//2020��11��12�� 00:00:00
    }
}
