package mybigdecimal;

import java.math.BigDecimal;

public class MyBigDecimalDemo2 {
    public static void main(String[] args) {
        // 如果想要进行精确运算，那么请使用字符串的构造
//        BigDecimal bd1 = new BigDecimal(0.1);
//        BigDecimal bd2 = new BigDecimal(0.2);
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

//        public BigDecimal add(另一个BigDecimal对象) 加法
        BigDecimal add = bd1.add(bd2);
        System.out.println("和为：" + add); //0.3
        //System.out.println(0.1 + 0.2); //0.30000000000000004

//        public BigDecimal subtract (另一个BigDecimal对象) 减法
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("差为：" + subtract); //-0.1

//        public BigDecimal multiply (另一个BigDecimal对象) 乘法
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("积为" + multiply); // 0.02

//        public BigDecimal divide (另一个BigDecimal对象) 除法
        BigDecimal divide = bd1.divide(bd2);
        System.out.println("商为" + divide); // 0.5

    }
}
