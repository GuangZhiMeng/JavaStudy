package d1;

import java.io.File;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\demo\\abc.txt");
        if (file.exists()){
            System.out.println("�ļ��Ѵ���");
            file.delete();
        }else {
            System.out.println("�ļ�������");
            file.createNewFile();
        }
    }
}
