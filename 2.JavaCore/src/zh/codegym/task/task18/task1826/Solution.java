package zh.codegym.task.task18.task1826;

/* 
加密
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        byte[] b = new byte[fileInputStream.available()];
        if (args[0].equals("-e")) {
            //加密：将文件内容读取到read中，创建新数组b1存放加密后的字节，通过for循环将每一个字节取反，存入b1中，然后写入输出流
            int read = fileInputStream.read(b);
            byte[] b1 = new byte[read];
            byte temp;
            for (int i = 0; i < read; i++) {
                temp = (byte) ~b[i];
                b1[i] = temp;
            }
            fileOutputStream.write(b1);
        } else if (args[0].equals("-d")) {
            //解密，同加密过程，读取字节，然后取反，最后写入输出流
            int read = fileInputStream.read(b);
            byte[] b1 = new byte[read];
            byte temp;
            for (int i = 0; i < read; i++) {
                temp = (byte) ~b[i];
                b1[i] = temp;
            }
            fileOutputStream.write(b1);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}
