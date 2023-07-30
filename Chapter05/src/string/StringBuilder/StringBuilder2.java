package string.StringBuilder;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //链式编程： 如果一个方法返回的是对象类型，对象就可以继续向下调用方法.
        sb.append("红色").append("蓝色").append("绿色");

        //public int length()：返回长度（字符出现的个数）
        System.out.println("sb中字符串的个数为：" + sb.length());
    }
}
