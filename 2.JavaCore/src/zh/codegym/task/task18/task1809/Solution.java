package zh.codegym.task.task18.task1809;

/* 
反转文件
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(filename1);
        FileOutputStream fileOutputStream = new FileOutputStream(filename2);

        List<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read();
            list.add(read);
        }
        fileInputStream.close();

        for (int i = list.size() - 1; i >= 0; i--) {
            fileOutputStream.write(list.get(i));
        }
        fileOutputStream.close();
    }
}
