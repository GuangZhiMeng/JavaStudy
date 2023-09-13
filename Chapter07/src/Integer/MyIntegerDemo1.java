package Integer;

public class MyIntegerDemo1 {
    public static void main(String[] args) {
//        public Integer(int   value)             | 根据 int 值创建 Integer 对象(过时)
//|       public Integer(String s)                | 根据 String 值创建 Integer 对象(过时)

//|       public static Integer valueOf(int i)    | 返回表示指定的 int 值的 Integer   实例
//|       public static Integer valueOf(String s) | 返回一个保存指定值的 Integer 对象 String
        Integer i1 = Integer.valueOf(200);
        Integer i2 = Integer.valueOf("200");
        System.out.println(i1);
        System.out.println(i2);
    }
}
