package study;

public class Sum {
    static int add(int x,int y){
        return x + y;
    }

    static int add(int x,int y,int z){
        return x + y + z;
    }

    static float add(float x,float y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2.1f,3.2f));
    }
}
