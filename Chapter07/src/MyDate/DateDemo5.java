package MyDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo5 {
    public static void main(String[] args) throws ParseException {
        //��ʼʱ�䣺2020��11��11�� 0:0:0
        //����ʱ�䣺2020��11��11�� 0:10:0

        //С��2020��11��11�� 0:03:47
        //СƤ2020��11��11�� 0:10:11

        //1.�ж���λͬѧ���µ�ʱ���Ƿ��ڷ�Χ֮�ھͿ����ˡ�
        //2.Ҫ��ÿһ��ʱ�䶼����ɺ���ֵ��

        String start = "2020��11��11�� 0:0:0";
        String end = "2020��11��11�� 0:10:0";

        String jia = "2020��11��11�� 0:03:47";
        String pi = "2020��11��11�� 0:10:11";

        // 1.���ַ������� ���Date��ʽ���ٰ�Date��ʽͨ��getTime()�������ɺ���ֵ���ܽ����ж���
        // ����һ��ʱ���ʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");

        // ����ʱ�䣬��Stringת����Date�� Ȼ��ͨ��getTime()��������ȡ����ֵ
        // ��ȡ��ʼʱ�������ʱ��ĺ���ֵ
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();

        // ��ȡС��ͬѧ��СƤͬѧ�µ��ĺ���ֵ ����ͬ��
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();

        // �ж��Ƿ��������ʱ�䷶Χ��
        if(jiaTime >= startTime && jiaTime <= endTime){
            System.out.println("С��ͬѧ�μ�������ɱ�");
        }else{
            System.out.println("С��ͬѧû�вμ�����ɱ�");
        }

        System.out.println("------------------------");

        if(piTime >= startTime && piTime <= endTime){
            System.out.println("СƤͬѧ�μ�������ɱ�");
        }else{
            System.out.println("СƤͬѧû�вμ�����ɱ�");
        }

    }
}
