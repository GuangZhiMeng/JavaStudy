package string;

public class Demo1String {
    public static void main(String[] args) {
        // public String() : 创建一个空白字符串对象，不含有任何内容
        String s1 = new String();
        System.out.println(s1);

        // public String(char[] chs) : 根据字符数组的内容，来创建字符串对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);//字符串字符串字符穿成的串
        System.out.println(s2);//abc

        // public String(String original) : 根据传入的字符串内容，来创建字符串对象
        String s3 = new String("123");
        System.out.println(s3);
    }
}
