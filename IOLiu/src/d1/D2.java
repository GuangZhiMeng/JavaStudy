package d1;

import java.io.File;

public class D2 {
    public static void main(String[] args) {
        File file = new File("d:\\demo\\abc");
        if (file.exists()){
            System.out.println("�ļ����Ѵ���");
        }else{
            file.mkdir();//�����ļ���
        }
    }
}
