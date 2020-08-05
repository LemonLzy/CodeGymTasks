package zh.codegym.task.task18.task1816;

/* 
ABC
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int lowercase = 0;
        int uppercase = 0;
        int total;

        //判断ascll码，大写字母的ascll码范围为65-90，小写字母的ascll范围为97-122
        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read();
            if ((read >= 65) && (read <= 90)) {
                uppercase++;
            } else if ((read >= 97) && (read <= 122)) {
                lowercase++;
            }
        }
        fileInputStream.close();

        total = lowercase + uppercase;
        System.out.println(total);
    }
}
