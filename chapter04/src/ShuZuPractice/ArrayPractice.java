package ShuZuPractice;
/*
1、定义长度为10的数组，随机生成10个[0,100)的整数
(1)遍历输出这些整数，要求每5个一行
(2)统计偶数的个数，并求所有偶数的累加和
(3)查找是否存在15
(4)找出最大值及其下标
 */
public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int count = 0;
        int evenCount = 0;
        int evenSum = 0;
        boolean flag = false;//默认不存在
        int max = -1;//arr数组中一定没有-1，当第一个元素与max比较时，一定比max大，max就自然被修改为第一个元素
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            count++;//元素的个数

            if(count == 5){//5个就换行
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i] + " ");//" "是字符类型，+ 才是拼接
            }

            if(arr[i] % 2 == 0){
                evenCount++;//偶数的个数
                evenSum += arr[i];//偶数的累加和
            }

            if(arr[i] == 15){
                flag = true;
            }

            if(arr[i] > max){
                max = arr[i];
                index = i;//没有考虑重复元素
            }
        }
            System.out.println("\n偶数的个数：" + evenCount);
            System.out.println("偶数的累加和：" + evenSum);
            System.out.println("最大值：" + max);
            System.out.println("最大的下标：" + index);
            System.out.println("15是否存在？" + (flag?"存在":"不存在"));
    }
}
