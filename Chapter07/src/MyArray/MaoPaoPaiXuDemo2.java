package MyArray;

public class MaoPaoPaiXuDemo2 {
    public static void main(String[] args) {
        // 需求：请对下列数组按顺序排序
        int [] arr = {3,5,2,1,4};

        // 调用冒牌排序方法
        bubbleSort(arr);
    }

    // 冒泡排序方法 调用时直接传入数组参数即可完成排序
    private static void bubbleSort(int[] arr){
        // 外层循环控制的是次数 比数组的长度少一次 arr.length - 1
        for (int i = 0; i < arr.length - 1; i++){
            // 内存循环就是实际循环比较的
            // -1 是为了让数组不要越界
            // -i 每一轮结束之后，我们就会少比一个数字
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 数据交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 调用遍历输出方法
        printArr(arr);
    }

    // 循环输出数组中的每一个元素的方法
    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
