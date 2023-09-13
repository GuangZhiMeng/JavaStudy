package MyDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        //从 String 到 Date
        //解析字符串
        //注意：你字符串的格式要和你要解析的格式是一样的才行、
        //所以你的格式要和该字符串的格式保持一致
        String s = "2023-09-13";

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(s);

        System.out.println(date);
    }
}
