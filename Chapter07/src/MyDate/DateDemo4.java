package MyDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        //�� String �� Date
        //�����ַ���
        //ע�⣺���ַ����ĸ�ʽҪ����Ҫ�����ĸ�ʽ��һ���Ĳ��С�
        //������ĸ�ʽҪ�͸��ַ����ĸ�ʽ����һ��
        String s = "2023-09-13";

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(s);

        System.out.println(date);
    }
}
