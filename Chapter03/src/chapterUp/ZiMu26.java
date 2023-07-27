package chapterUp;

public class ZiMu26 {
    public static void main(String[] args) {
        // 循环输出26个小写英文字母
        // 方法1
        for(char c ='a'; c<='z'; c++){
            System.out.print(c+"\t");
        }

        // 方法2
        for(int i=0; i<26; i++){
            System.out.print((char)('a'+1) + "\t");
        }
    }
}
