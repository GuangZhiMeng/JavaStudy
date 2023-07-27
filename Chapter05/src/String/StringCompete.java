package String;

public class StringCompete {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true

        // equalsIgnoreCase() 将此String与另一个String相比较，不考虑大小写
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
}
