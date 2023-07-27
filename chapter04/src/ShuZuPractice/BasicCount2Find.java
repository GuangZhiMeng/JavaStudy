package ShuZuPractice;
/*
3、数组元素的查找
(1)顺序查找：数组的元素挨个与目标做比对，如果相等，就表示找到了，所有元素都不等，就是没找到
(2)二分查找：
数组的元素必须是有序的，一般是从小到大。

以猜数为例：[1,100]
猜50，提示大了，排除了[50,100]
猜25，提示小了，排除了[1,25]
……
 */
public class BasicCount2Find {
    public static void main(String[] args) {
        //前提：数组是有序的
        int[] arr = {3,6,8,12,35,78,89};
        int target = 6;

        int index = -1;//正常的下标不可能是-1
        for(int left = 0,right = arr.length - 1; left <= right; ){
            //int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if(target == arr[mid]){
                index = mid;
                break;
            }else if(target > arr[mid]){
                //目标靠右边，修改左边界
                left = mid + 1;//排除了[之前left,mid]
            }else{
                //目标靠左边，修改右边界
                right = mid - 1;//排除了[mid,之前的right]
            }
        }

        if(index == -1){
            System.out.println("不存在");
        }else{
            System.out.println("存在");
            System.out.println("下标是：" + index);
        }
    }
}
