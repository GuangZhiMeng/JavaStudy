package String.StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        // public StringBuilder():创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();//表示里面是空的
        System.out.println(sb);

        // public StringBuilder(String   str):根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("abc");// 根据你传入的字符串内容来创建可变的字符串
        // 表示容器刚创建里面就有你传入的内容
        System.out.println(sb2);
    }
}
