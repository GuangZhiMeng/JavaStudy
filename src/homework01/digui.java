package homework01;

public class digui {
    public static void main(String[] args) {
        System.out.print(fun(4));
    }

    static int fun(int n){
        return (n == 1)?1:n*fun(n-1);
        //        if(n == 1){
        //            return 1;
        //            return n * fun(n - 1);
        //        }
    }
}
