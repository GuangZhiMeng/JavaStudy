public class InterviewTest {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder sb = new StringBuilder("abc");
        // 1. ��ʱ���õ���String���е�equals����
        // ��֤����Ҳ���ַ��������򲻻�Ƚ�����ֵ��ֱ�ӷ���false
        // System.out.println(s1.equals(sb));// false

        //  //StringBuilder������û����дequals����,�õľ���Object���е�.
        System.out.println(sb.equals(s1)); // false

    }
}
