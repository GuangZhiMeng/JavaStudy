package YiChang;

import java.text.SimpleDateFormat;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        // 数组访问越界异常 ArrayIndexOutOfBoundsException
//        int [] arr = {1,2,3,4,5};
//        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException

        // 不能用null去调用方法 不然就会出现 空指针异常 NullPointerException
//        String s = null;
//        System.out.println(s.equals("嘿嘿"));//NullPointerException

        // 日期格式化异常 ParseException
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        sdf.parse("2048-1月1日");//ParseException
    }
}
