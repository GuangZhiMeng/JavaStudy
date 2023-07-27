package ShuZu;

public class TwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;

        System.out.println(arr1);//[I@1540e19d
        System.out.println(arr2);//[I@1540e19d

        /*
        arr1和arr2是两个数组变量，但是它们都是指向堆中同一个数组对象
         */

        arr2[1] = 100;//修改arr2数组的第二个元素的值为100

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[1]);//发现arr1[1]元素被修改为100
        }
    }
}