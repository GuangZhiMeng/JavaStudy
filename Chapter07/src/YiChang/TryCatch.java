package YiChang;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = null;
        try{
            //有可能发现异常的代码
            printArr(arr);
        }catch (NullPointerException e){
            //如果出现了这样的异常，那么我们进行的操作
            System.out.println("参数不能为null");
        }
        System.out.println("哥最帅");
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
