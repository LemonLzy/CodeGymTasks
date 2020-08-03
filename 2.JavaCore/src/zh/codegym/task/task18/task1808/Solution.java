package zh.codegym.task.task18.task1808;

/* 
分割文件
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        String filename3 = bufferedReader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(filename1);

        FileOutputStream fileOutputStream2 = new FileOutputStream(filename2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(filename3);

        int total = fileInputStream1.available();
        int num2 = total % 2 == 0 ? total / 2 : (total + 1) / 2;
        int num3 = total - num2;

        byte[] buffer = new byte[num2];

        fileInputStream1.read(buffer);
        fileOutputStream2.write(buffer, 0, num2);

        fileInputStream1.read(buffer);
        fileOutputStream3.write(buffer, 0, num3);

        fileInputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
}
