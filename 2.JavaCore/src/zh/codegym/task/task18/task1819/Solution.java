package zh.codegym.task.task18.task1819;

/* 
合并文件，此题未通过，实际运行ok
思路：将第一个文件追加到第二个文件末尾，再将第二个文件反写至文件一并覆盖。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream fileInputStream1 = new FileInputStream(filename1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(filename2, true);

        while (fileInputStream1.available() > 0) {
            int read = fileInputStream1.read();
            fileOutputStream2.write(read);
        }
        fileInputStream1.close();
        fileOutputStream2.close();

        FileInputStream fileInputStream2 = new FileInputStream(filename2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(filename1);

        while (fileInputStream2.available() > 0) {
            int read = fileInputStream2.read();
            fileOutputStream1.write(read);
        }
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
