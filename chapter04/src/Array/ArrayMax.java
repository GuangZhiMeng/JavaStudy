package Array;

public class ArrayMax {
    public static void main(String[] args){
        //用静态初始化定义数组
        int[] q = new int[]{11,77,98,66,83};

        //假设数组中的第一个元素为最大值
        int max = q[0];

        //遍历数组，获取每一个元素，准备进行比较
        for (int i = 1; i < q.length; i++){
            if (q[i] > max){
                //如果比较的过程中，出现了比 max 更大的，让 max 记录更大的值
                max = q[i];
            }
        }
        //循环结束后，打印最大值
        System.out.println("Max = " + max);
    }
}
