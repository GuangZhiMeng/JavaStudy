package Objects;

import java.util.Objects;

public class MyObjectsDemo {
    public static void main(String[] args) {
//        public static String toString(����) ���ز����ж�����ַ�����ʾ��ʽ��
//        Student s = new Student("С��ͬѧ",19);
//        String result = Objects.toString(s);
//        System.out.println(result);

//        public static String toString(����, Ĭ���ַ���) ���ض�����ַ�����ʾ��ʽ���������Ϊ�գ��򷵻صڶ�������
//        Student s = null;
//        String result = Objects.toString(s,"���һ��");
//        System.out.println(result); // ���һ��


//        public static Boolean isNull(����) �ж϶����Ƿ�Ϊ��
//        Student s = null;
//        Student a = new Student();
//        boolean result = Objects.isNull(s);
//        System.out.println(result); // true
//        boolean result2 = Objects.isNull(a);
//        System.out.println(result2); // false

//        public static Boolean nonNull(����) �ж϶����Ƿ�Ϊ��
        Student s = null;
        Student a = new Student();
        boolean result = Objects.nonNull(s);
        System.out.println(result); // false
        boolean result2 = Objects.nonNull(a);
        System.out.println(result2); // true

    }
}
