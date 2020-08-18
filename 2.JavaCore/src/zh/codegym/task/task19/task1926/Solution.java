package zh.codegym.task.task19.task1926;

/* 
镜像图像
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        bufferedReader.close();

        while (fileReader.ready()) {
            String str = fileReader.readLine();
            String str2 = new StringBuilder(str).reverse().toString();
            System.out.println(str2);
        }
        fileReader.close();
    }
}
