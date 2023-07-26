package chapterUp;

public class foobizbaz {
    public static void main(String[] args) {
        /*
        从1循环到150并在每行打印一个值，
        另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”
         */

        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            //if 并列的话就都会进行判断
            // 制表符可直接写在""双引号里面
            if(i % 3 == 0) {
                System.out.print("\t\tfoo");
            }
            if(i % 5 == 0) {
                    System.out.print("\t\tbiz");
            }
            if(i % 7 == 0){
                System.out.print("\t\tbaz");
            }
            System.out.println();//输出空格
        }
    }
}
