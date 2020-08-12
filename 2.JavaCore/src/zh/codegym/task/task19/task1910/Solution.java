package zh.codegym.task.task19.task1910;

/* 
标点符号
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(filename1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename2));

        while (fileReader.ready()) {
            String str = fileReader.readLine();
            String newStr = str.replaceAll("[^A-Za-z0-9 ]", "");
            fileWriter.write(newStr);
        }
        fileReader.close();
        fileWriter.close();
    }
}
