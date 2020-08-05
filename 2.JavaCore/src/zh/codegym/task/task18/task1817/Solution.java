package zh.codegym.task.task18.task1817;

/* 
空格
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int space = 0;
        int total = 0;

        //判断ascll码，空格的ascll码为32
        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read();
            total++;
            if (read == 32) {
                space++;
            }
        }
        fileInputStream.close();

        double result = (double) space / total * 100;

        System.out.printf("%.2f", result);
    }
}
