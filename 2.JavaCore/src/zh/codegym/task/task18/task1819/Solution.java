package zh.codegym.task.task18.task1819;

/* 
合并文件，此题未通过，实际运行ok
思路：将第一个文件追加到第二个文件末尾，再将第二个文件反写至文件一并覆盖。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        br.close();

        FileInputStream in = new FileInputStream(fileName1);
        FileOutputStream out = new FileOutputStream(fileName1);
        FileInputStream in1 = new FileInputStream(fileName2);

        byte[] bt = new byte[in.available()];
        byte[] bt1 = new byte[in1.available()];
        int data;

        while (in.available() > 0) {
            data = in.read(bt);
        }
        in.close();

        while (in1.available() > 0) {
            data = in1.read(bt1);
            out.write(bt1);
            out.write(bt);
        }
        in1.close();
        out.close();
    }
}
