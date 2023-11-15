package YiChang;

public class TryCatch2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        try{
            for (int i = 0; i <= 5 ; i++) {
                System.out.println(a[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界");
        }finally {
            System.out.println(111111111);
        }
        System.out.println("******");
    }
}
