package ShuZu;

public class TwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;

        System.out.println(arr1);//[I@1540e19d
        System.out.println(arr2);//[I@1540e19d

        /*
        arr1��arr2����������������������Ƕ���ָ�����ͬһ���������
         */

        arr2[1] = 100;//�޸�arr2����ĵڶ���Ԫ�ص�ֵΪ100

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[1]);//����arr1[1]Ԫ�ر��޸�Ϊ100
        }
    }
}