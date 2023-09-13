package MyArray;

public class ErFenSearchDemo {
    // ��ʾ����Ķ��ֲ���
    // Ҫʹ�ö��ֲ��ң������������
    public static void main(String[] args) {
        // �ȴ���һ������
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // Ҫ���ҵ�Ԫ��
        int number = 3;

        // �ڴ�������֮ǰ�����Լ���������
        // 1.������Ҫ��� --- ���ֲ���
        // 2.�Ҹ��������Ҫʲô�� --- ���� Ԫ��
        // 3.�Ҹ����ˣ�Ҫ��Ҫ�ѽ�����ص����� --- ���������ظ�������
        int index = binarySearchForIndex(arr,number);
        System.out.println(index);
    }

    private static int binarySearchForIndex(int[] arr, int number){
        // 1.������ҵķ�Χ
        int min = 0;
        int max = arr.length - 1;
        // 2.ѭ������ min <= max
        while(min <= max){
            // 3.������м�λ�� mid
            int mid = (min + max) / 2; // int mid = (min + max) >> 1;
            // midָ���Ԫ�� > number
            if(arr[mid] > number){
                // ��ʾҪ���ҵ�Ԫ�������
                max = mid - 1;
            }else if(arr[mid] < number){
                // midָ���Ԫ�� < number
                // ��ʾҪ���ҵ�Ԫ�����ұ�
                min = mid + 1;
            }else{
                // midָ���Ԫ�� == number
                return mid;
            }

        }
        // ���min������max�ͱ�ʾԪ�ز����ڣ�����-1
        return -1;
    }
}
