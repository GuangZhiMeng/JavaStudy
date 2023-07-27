package Array;

public class ArrayDemo1{
    public static void main(String[] args){
        //用静态初始化定义一个数组
        int[] q = new int[] {11,22,33,44,55};
        //调用遍历方法
        printArray(q);
    }

    //定义一个方法，对数组进行遍历
    public static void printArray(int[] q){
        // q.fori
        System.out.print("[");
        for (int i = 0; i < q.length; i++) {
            if (i == q.length - 1){
                //如果满足条件，说明到了最后一个元素，那就把最后一个逗号换成 ]
                //为了不影响方法下面的代码，在最后一次打印时要换行处理
                System.out.println(q[i] + "]");
            }else {
                //遍历打印，数据不换行
                System.out.print(q[i] + ",");
            }
        }

    }
}