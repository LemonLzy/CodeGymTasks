package zh.codegym.task.task18.task1818;

/* 
合二为一
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        String filename3 = bufferedReader.readLine();

        FileOutputStream fileOutputStream1 = new FileOutputStream(filename1, true);
        FileInputStream fileInputStream2 = new FileInputStream(filename2);
        FileInputStream fileInputStream3 = new FileInputStream(filename3);

        while (fileInputStream2.available() > 0) {
            int read = fileInputStream2.read();
            fileOutputStream1.write(read);
        }
        fileInputStream2.close();

        while (fileInputStream3.available() > 0) {
            int read = fileInputStream3.read();
            fileOutputStream1.write(read);
        }
        fileInputStream3.close();
        fileOutputStream1.close();
    }
}
