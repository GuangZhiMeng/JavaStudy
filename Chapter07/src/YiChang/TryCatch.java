package YiChang;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = null;
        try{
            //�п��ܷ����쳣�Ĵ���
            printArr(arr);
        }catch (NullPointerException e){
            //����������������쳣����ô���ǽ��еĲ���
            System.out.println("��������Ϊnull");
        }
        System.out.println("����˧");
    }

    private static void printArr(int[] arr){
        if(arr == null){
            throw new NullPointerException();
        }else{
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
