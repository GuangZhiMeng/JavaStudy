package ShuZuPractice;

public class ArrayExer1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 8,2,1,0,3 };
        int[] index = new int[] { 2,0,3,2,4,0,1,3,2,3,3 };
        String tel = ""; //字符串，初始化为空字符串
        for(int i = 0; i < index.length; i++){
            tel += arr[index[i]];
        }
        /*
        tel = arr[index[0]] + arr[index[1]] + arr[index[2]] + …… + arr[index[10]];
        tel = arr[2] + arr[0] + arr[3] + …… + arr[3];
        tel = 1 + 8 + 0 + …… + 0  拼接
         */
        System.out.println("联系方式：" + tel);//18013820100
    }
}
