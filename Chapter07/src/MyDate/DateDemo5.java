package MyDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo5 {
    public static void main(String[] args) throws ParseException {
        //开始时间：2020年11月11日 0:0:0
        //结束时间：2020年11月11日 0:10:0

        //小贾2020年11月11日 0:03:47
        //小皮2020年11月11日 0:10:11

        //1.判断两位同学的下单时间是否在范围之内就可以了。
        //2.要把每一个时间都换算成毫秒值。

        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";

        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";

        // 1.把字符串解析 变成Date格式，再把Date格式通过getTime()方法换成毫秒值就能进行判断了
        // 设置一个时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 解析时间，把String转换成Date形 然后通过getTime()方法，获取毫秒值
        // 获取开始时间与结束时间的毫秒值
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();

        // 获取小贾同学与小皮同学下单的毫秒值 方法同上
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();

        // 判断是否在允许的时间范围内
        if(jiaTime >= startTime && jiaTime <= endTime){
            System.out.println("小贾同学参加上了秒杀活动");
        }else{
            System.out.println("小贾同学没有参加上秒杀活动");
        }

        System.out.println("------------------------");

        if(piTime >= startTime && piTime <= endTime){
            System.out.println("小皮同学参加上了秒杀活动");
        }else{
            System.out.println("小皮同学没有参加上秒杀活动");
        }

    }
}
