package d1;

import java.io.File;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\demo\\abc.txt");
        if (file.exists()){
            System.out.println("文件已存在");
            file.delete();
        }else {
            System.out.println("文件不存在");
            file.createNewFile();
        }
    }
}
