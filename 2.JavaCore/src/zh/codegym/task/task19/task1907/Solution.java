package zh.codegym.task.task19.task1907;

/* 
字词计数
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(filename);

        Scanner scanner = new Scanner(fileReader);
        scanner.useDelimiter("\\W");
        int worldCount = 0;
        while (scanner.hasNext()){
            String data = scanner.next();
            if (data.equals("world")) {
                worldCount++;
            }
        }
        fileReader.close();

        System.out.println(worldCount);
    }
}
