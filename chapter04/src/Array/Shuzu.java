package Array;

public class Shuzu {
        public static void main(String[] args){
            // 数据类型[][] 变量名 = new 数据类型[m][n];
            int[][] arr = new int[3][3];
        /*
            [[I@10f87f48

            @ : 分隔符
            10f87f48 : 十六进制内存地址
            I : 数组中存储的数据类型
            [[ : 几个中括号就代表的是几维数组
         */
            System.out.println(arr);

            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
        }
}
