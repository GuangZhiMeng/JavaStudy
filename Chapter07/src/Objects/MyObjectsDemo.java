package Objects;

import java.util.Objects;

public class MyObjectsDemo {
    public static void main(String[] args) {
//        public static String toString(对象) 返回参数中对象的字符串表示形式。
//        Student s = new Student("小罗同学",19);
//        String result = Objects.toString(s);
//        System.out.println(result);

//        public static String toString(对象, 默认字符串) 返回对象的字符串表示形式。如果对象为空，则返回第二个参数
//        Student s = null;
//        String result = Objects.toString(s,"随便一个");
//        System.out.println(result); // 随便一个


//        public static Boolean isNull(对象) 判断对象是否为空
//        Student s = null;
//        Student a = new Student();
//        boolean result = Objects.isNull(s);
//        System.out.println(result); // true
//        boolean result2 = Objects.isNull(a);
//        System.out.println(result2); // false

//        public static Boolean nonNull(对象) 判断对象是否不为空
        Student s = null;
        Student a = new Student();
        boolean result = Objects.nonNull(s);
        System.out.println(result); // false
        boolean result2 = Objects.nonNull(a);
        System.out.println(result2); // true

    }
}
