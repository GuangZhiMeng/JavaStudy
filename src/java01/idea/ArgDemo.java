package java01.idea;

public class ArgDemo {
    public static void main(String[] args) {
        int sum = 0;
        sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("和为：" + sum);
    }
}
