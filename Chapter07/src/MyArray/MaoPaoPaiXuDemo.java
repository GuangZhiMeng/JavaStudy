package MyArray;

public class MaoPaoPaiXuDemo {
    // ��ʾð������
//    1. ���ڵ�Ԫ�������Ƚϣ���ķ��ұߣ�С�ķ���ߣ��ҵ����ֵ
//    2. ��һ��ѭ�����������ֵ�Ѿ��ҵ�������������ұߡ�
//    3. ��һ��ֻҪ��ʣ���Ԫ�������ֵ�Ϳ�����
//    4. ��Ϊ�Ѿ�ȷ����5�����ֵ������4��5�����ٽ��бȽ���
//    5. ��Ϊ�Ѿ�ȷ����5�����ֵ��4�Ǵδ�ֵ������3�����4��5�ٽ��бȽ���
//    6. ͬ��3��4��5��λ���Ѿ�ȷ���ˣ�2Ҳ����������ֵ���бȽ���
//    7. ���ֻʣ��һ��ֵ1�ˣ��϶��ͷ������һ��������

    public static void main(String[] args) {
        // ��������������鰴˳������
        int [] arr = {3,5,2,1,4};

        // ��һ��
        // �����ֵ5�ҳ����������ŵ���������ұ�
        // -1 ��Ϊ����������������Χ
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // ���ݽ���
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // �ڶ���
        // �ڶ��ֲ��ú�5�Ƚϣ�������-1
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // ���ݽ���
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // ������ͬ��
        for (int i = 0; i < arr.length - 1 - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                // ���ݽ���
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // ������ͬ��
        for (int i = 0; i < arr.length - 1 - 3; i++) {
            if (arr[i] > arr[i + 1]) {
                // ���ݽ���
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
