package homework01;

public class ChengFaBiao {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (j * i) + "\t");
                //"\t"这是JAVA语言默认的制表符号

//                if (i == j) {
//                    System.out.print("\n");//当换行条件成立时，进行换行打印
//                }
            }
            //实现换行
            System.out.println();
        }
    }
}
