package zh.codegym.task.task18.task1820;

/* 
数字四舍五入
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        bufferedReader.close();

        Scanner scanner = new Scanner(new FileInputStream(filename1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2));

        while (scanner.hasNext()) {
            String str = scanner.next();
            bufferedWriter.write(Math.round(Float.parseFloat(str)) + " ");
        }

        scanner.close();
        bufferedWriter.close();
    }
}
