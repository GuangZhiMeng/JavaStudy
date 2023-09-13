package MyArray;

public class KuaiSuPaiXuDemo2 {
    public static void main(String[] args) {
        //        1�����ҿ�ʼ�ұȻ�׼��С��
        //        2������ʼ�ұȻ�׼�����
        //        3����������ֵ��λ��
        //        4����ɫ���������ң���ɫ���������ң�ֱ��������ͷָ��ͬһ������Ϊֹ
        //        5����׼����λ
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        // ����һ������
        // arr��һ������������Ҫ���������
        // 0,arr.length-1 �ڶ����͵���������������Ҫ��������ķ�Χ
        quiteSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // �������򷽷�
    private static void quiteSort(int[] arr, int left, int right){
        if (right < left){
            return;
        }

        // �Ա���������ʱ�洢
        int left0 = left;
        int right0 = right;

        // �������׼��
        int baseNumber = arr[left0];

        while (left != right){
            // 1�����ҿ�ʼ�ұȻ�׼��С��
            while (arr[right] >= baseNumber && right > left){
                right--;
            }
            // 2������ʼ�ұȻ�׼�����
            while (arr[left] <= baseNumber && right > left){
                left++;
            }
            // 3����������ֵ��λ��
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        // ��left == right Ҳ����ֱ��������ͷָ��ͬһ������ʱ
        // ��׼����λ
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        // �ٴο���
        // �����
        quiteSort(arr,left0,left - 1);
        // ���ұ�
        quiteSort(arr,left + 1,right0);
    }
}
