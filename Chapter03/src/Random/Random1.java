package Random;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        /*
        Random：产生随机数
        1.导包：import java.util.Random;
        注：：导包的动作必须出现在类定义的上面
        2.创建对象：Random r = new Random();
        注：只有变量名 r 可以变，其他的都不允许变
        3.获取随机数：int number = r.nextInt(10);
        注：获取数据的范围：[0,10) number和10可以变，其它都不行
         */

        //创建对象
        Random r = new Random();

        //获取10个随机数
        for (int i = 0; i <= 10; i++) {
            //获取随机数
            int num = r.nextInt(10) + 1;//1~10
            System.out.printf("%d ",num);
        }
     }
}
