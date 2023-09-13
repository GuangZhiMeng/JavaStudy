package Jdk8Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Jdk8DateDemo1 {
    public static void main(String[] args) throws ParseException {
        //JDKMethod();

        // 定义一个字符串
        String s = "2020年11月11日 00:00:00";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, pattern);
        LocalDateTime newLocalDateTime = localDateTime.plusDays(1);
        String result = newLocalDateTime.format(pattern);
        System.out.println(result);

    }

    private static void JDKMethod() throws ParseException{
        // 定义一个字符串
        String s = "2020年11月11日 00:00:00";

        // 设置时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 把String格式 转成 Date格式，并通过getTime()方法获取毫秒值
        Date date = sdf.parse(s);
        long time = date.getTime();
        // 一天的毫秒值：1000*60*60*24
        time = time + (1000 * 60 * 60 * 24);
        // 创建一个Date对象 使用指定的毫秒值
        Date newDate = new Date(time);

        // 格式化输出 Date 转 String
        String result = sdf.format(newDate);
        System.out.println(result);//2020年11月12日 00:00:00
    }
}
