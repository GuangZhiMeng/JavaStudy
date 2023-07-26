package ShuZu;
/*
   随机产生10个[0,100)之间整数放到一维数组中，然后遍历所有随机数，并统计随机数中满足3的倍数有几个。
*/
public class ArrayMultiple {
    public static void main(String[] args) {
        // 1、声明一个数组，并且初始化长度为 10
        //声明格式：元素的类型[] 数组名 = new 元素的类型[长度];
        int[] arr = new int[10];
        //2、给元素赋值
        //通过Math.random()产生，范围[0,100)
        //Math.random()是令系统随机选取大于等于 0.0 且小于 1.0 的伪随机 double 值
        //3、顺便统计个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
            if(arr[i] % 3 == 0){
                count++;
            }
        }        System.out.println("在所有随机数中满足3的倍数的有：" + count + "个");
    }
}
