package mybigdecimal;

import java.math.BigDecimal;

public class MyBigDecimalDemo2 {
    public static void main(String[] args) {
        // �����Ҫ���о�ȷ���㣬��ô��ʹ���ַ����Ĺ���
//        BigDecimal bd1 = new BigDecimal(0.1);
//        BigDecimal bd2 = new BigDecimal(0.2);
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

//        public BigDecimal add(��һ��BigDecimal����) �ӷ�
        BigDecimal add = bd1.add(bd2);
        System.out.println("��Ϊ��" + add); //0.3
        //System.out.println(0.1 + 0.2); //0.30000000000000004

//        public BigDecimal subtract (��һ��BigDecimal����) ����
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("��Ϊ��" + subtract); //-0.1

//        public BigDecimal multiply (��һ��BigDecimal����) �˷�
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("��Ϊ" + multiply); // 0.02

//        public BigDecimal divide (��һ��BigDecimal����) ����
        BigDecimal divide = bd1.divide(bd2);
        System.out.println("��Ϊ" + divide); // 0.5

    }
}
