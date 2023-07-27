package ShuZu;

public class ArrayZiMu {
    public static void main(String[] args) {
        /*
        用一个数组存储26个英文字母的小写形式，并遍历显示小写字母以及它对应的大写字母，例如：a->A
提示：小写字母'a'对应编码值是97，字母'b'对应编码值是98，依次类推
     大写字母'A'对应编码值是65，字母'B'对应编码值是66，依次类推
         */

        // 方法1
//        char[] LowCaseLetters = new char[26];
//        char[] UpperCaseLetters = new char[26];
//
//        for(char c = 'a',b = 'A'; c <= 'z' && b <= 'Z'; c++,b++){
//            LowCaseLetters[c - 97] = c;
//            UpperCaseLetters[b - 65] = b;
//            System.out.println(LowCaseLetters[c - 97] + "->" + UpperCaseLetters[b - 65]);

        // 方法2 动态初始化
        char[] LowCaseLetters = new char[26];
        for(int i = 0; i < LowCaseLetters.length; i++){
            LowCaseLetters[i] = (char)('a' + i);

            System.out.println(LowCaseLetters[i] + "->" + (char)(LowCaseLetters[i]-32));
        }
    }
}
