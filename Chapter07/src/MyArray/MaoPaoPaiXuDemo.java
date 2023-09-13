package MyArray;

public class MaoPaoPaiXuDemo {
    // 演示冒泡排序
//    1. 相邻的元素两两比较，大的放右边，小的放左边，找到最大值
//    2. 第一次循环结束，最大值已经找到，在数组的最右边。
//    3. 下一次只要在剩余的元素找最大值就可以了
//    4. 因为已经确定了5是最大值，所以4跟5无须再进行比较了
//    5. 因为已经确定了5是最大值，4是次大值。所以3无须跟4和5再进行比较了
//    6. 同理3，4，5的位置已经确定了，2也无须这三个值进行比较了
//    7. 最后只剩下一个值1了，肯定就放在最后一个格子中

    public static void main(String[] args) {
        // 需求：请对下列数组按顺序排序
        int [] arr = {3,5,2,1,4};

        // 第一轮
        // 把最大值5找出，并把它放到数组的最右边
        // -1 是为了让索引不超出范围
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // 数据交换
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // 第二轮
        // 第二轮不用和5比较，所以再-1
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // 数据交换
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // 第三轮同理
        for (int i = 0; i < arr.length - 1 - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                // 数据交换
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // 第四轮同理
        for (int i = 0; i < arr.length - 1 - 3; i++) {
            if (arr[i] > arr[i + 1]) {
                // 数据交换
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
