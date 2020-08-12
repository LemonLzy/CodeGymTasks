package zh.codegym.task.task19.task1906;

/* 
偶数字符
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        List<Integer> list = new ArrayList<>();

        while (fileReader.ready()) {
            int read = fileReader.read();
            list.add(read);
        }
        fileReader.close();

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                //由于fileReader读取的直接为ascll码，所以通过(char) (list.get(i) + 0)转换为字符打印
                fileWriter.write((char) (list.get(i) + 0));
            }
        }
        fileWriter.close();
    }
}
