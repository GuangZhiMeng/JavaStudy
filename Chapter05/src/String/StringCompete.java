package String;

public class StringCompete {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true

        // equalsIgnoreCase() ����String����һ��String��Ƚϣ������Ǵ�Сд
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
}
