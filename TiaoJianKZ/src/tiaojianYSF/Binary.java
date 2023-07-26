package tiaojianYSF;

public class Binary {
    public static void main(String[] args) {
        int num = -1; //定义一个负整数
        int i = 31;
        while(i >= 0){
            //在循环中，使用位运算符>>将num右移i位，然后使用&运算符取出最后一位二进制数，即1或0。
            //&: 如果相对应位都是1，则结果为1，否则为0
            //& 是位运算符 AND，表示对两个二进制数进行 AND 运算
            //1 是一个二进制数，表示只有最后一位是1，其余位都是0。
            int bit = (num >> i) & 1;

            System.out.print(bit);
            //i从31递减到0，表示32位二进制数中的每一位
            i--;
        }
    }
}
