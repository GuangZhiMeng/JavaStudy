package MyArray;

public class MaoPaoPaiXuDemo2 {
    public static void main(String[] args) {
        // ��������������鰴˳������
        int [] arr = {3,5,2,1,4};

        // ����ð�����򷽷�
        bubbleSort(arr);
    }

    // ð�����򷽷� ����ʱֱ�Ӵ���������������������
    private static void bubbleSort(int[] arr){
        // ���ѭ�����Ƶ��Ǵ��� ������ĳ�����һ�� arr.length - 1
        for (int i = 0; i < arr.length - 1; i++){
            // �ڴ�ѭ������ʵ��ѭ���Ƚϵ�
            // -1 ��Ϊ�������鲻ҪԽ��
            // -i ÿһ�ֽ���֮�����Ǿͻ��ٱ�һ������
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // ���ݽ���
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // ���ñ����������
        printArr(arr);
    }

    // ѭ����������е�ÿһ��Ԫ�صķ���
    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
