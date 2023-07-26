package ShuZu;

public class TwoArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];//arr2数组的长度和arr1一致，arr2中元素还未定义所以默认都是0

        System.out.println(arr1);//[I@1540e19d
        System.out.println(arr2);//[I@677327b6

        //把arr1的元素复制给arr2
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);
        }
    }
}
