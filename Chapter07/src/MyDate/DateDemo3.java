package MyDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        //��ʽ������ Date �� String
        //��ǰʱ���Date����
        Date date = new Date();

        //������һ�����ڸ�ʽ��
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String result1 = sdf.format(date);
        System.out.println(result1);
    }
}
