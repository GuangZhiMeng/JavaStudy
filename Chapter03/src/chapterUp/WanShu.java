package chapterUp;

public class WanShu {
    public static void main(String[] args) {
        /*
        一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
例如6=1＋2＋3.编程 找出1000以内的所有完数
         */

        // int sum=0; 如果定义在这，sum累加的是所有数的因子

        //找出1000以内的所有完数
        for(int i=1; i <= 1000; i++){
            int sum = 0;
            //判断i是否是完数，如果是就打印
            /*
            [1,1000]范围内找出i的所有因子，累加起来
             */
            for(int j=1; j<i; j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
