package MyArray;

import java.util.Arrays;

public class MyArraysDemo {
    public static void main(String[] args) {
        //        public static String toString(int[] a)    ����ָ����������ݵ��ַ�����ʾ��ʽ
        //        int [] arr = {3,2,4,6,7};
        //        System.out.println(Arrays.toString(arr));

        //        public static void sort(int[] a)	  ��������˳������ָ��������
        //        int [] arr = {3,2,4,6,7};
        //        Arrays.sort(arr);
        //        System.out.println(Arrays.toString(arr));

        //        public static int binarySearch(int[] a, int key) ���ö��ֲ��ҷ���ָ��Ԫ�ص�����
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr, 0);
        System.out.println(index);
        //1,�����������
        //2.���Ҫ���ҵ�Ԫ�ش���,��ô���ص������Ԫ��ʵ�ʵ�����
        //3.���Ҫ���ҵ�Ԫ�ز�����,��ô���ص��� (-�����-1)
        //�����:������Ԫ����������,��Ӧ�����ĸ�������.
    }
}