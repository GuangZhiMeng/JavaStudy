package YiChang;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //int [] arr = {1,2,3,4,5};
        int [] arr = null;
        printArr(arr);//�ͻ� ���յ�һ���쳣.
        //���ǻ���Ҫ�Լ�����һ���쳣.
    }

    private static void printArr(int[] arr) {
        if(arr == null){
            //������֪���ɹ���ӡ����?
            //System.out.println("��������Ϊnull");
            throw new NullPointerException(); //������Ϊnull��ʱ��
            //�ֶ�������һ���쳣����,�׸��˵�����.
        }else{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

