package mybigdecimal;

import java.math.BigDecimal;

public class MyBigDecimalDemo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(10.0);
        BigDecimal bd2 = new BigDecimal("0.3");

        System.out.println(bd1); // 10
        System.out.println(bd2); // 0.3

    }
}
