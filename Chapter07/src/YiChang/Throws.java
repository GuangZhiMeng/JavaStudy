package YiChang;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Throws {
    public static void main(String[] args) throws ParseException {
        method1(); //��ʱ������Ҳû�д���.���ǻύ�����������.
        method2(); //���Ǽ������������ߴ���.��main�����ĵ���������������ǻ��ȡ�����Ĭ�ϴ����쳣�ķ���.
    }

    //���ߵ�����,�������,�п��ܻ�����������쳣Ŷ.
    //���������û�г����쳣,��ô����ִ��
    //�����������ĳ������쳣,��ʵҲ�ǽ�����쳣�����˵����ߴ���.

    //����������쳣��һ������ʱ�쳣,��ô�����Ĵ������ʡ��
    // ����ʱ�쳣
    private static void method1() /*throws NullPointerException*/ {
        int [] arr = null;
        for (int i = 0; i < arr.length; i++) {//���ֵĿ�ָ���쳣,���������������������.
            System.out.println(arr[i]);
        }
    }

    //���ߵ�����,�������,�п��ܻ�����������쳣Ŷ.
    //���������û�г����쳣,��ô����ִ��
    //�����������ĳ������쳣,��ʵҲ�ǽ�����쳣�����˵����ߴ���.

    //����������쳣��һ������ʱ�쳣,��ô�����Ĵ������Ҫ�ֶ�д��.
    //����ʱ�쳣
    private static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
        sdf.parse("2048-10��10��");
    }
}
