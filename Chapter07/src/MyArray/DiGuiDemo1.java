package MyArray;

public class DiGuiDemo1 {
    public static void main(String[] args) {
        int result = getJc(5);
        System.out.println(result);
    }

    // 递归方法求阶乘
    private static int getJc(int i){
        // 1.一定要找到出口
        if (i == 1){
            return 1;
        }else {
            // 2.递归的规则
            return i * getJc(i - 1);
        }
    }
}
