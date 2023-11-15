package d1;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class D3 {
    public static void main(String[] args) throws IOException {
        File file = new File("\"D:\\test.txt\"");
        if(!(file.exists())){
            file.createNewFile();
        }
        InputStream is = new FileInputStream(file);
        byte a[] = new byte[100];
        int len = is.read(a);
    }
}
