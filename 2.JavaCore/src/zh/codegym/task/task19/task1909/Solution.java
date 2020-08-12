package zh.codegym.task.task19.task1909;

/* 
更改标点符号
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(filename1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename2));
        List<Integer> list = new ArrayList<>();

        while (fileReader.ready()) {
            int read = fileReader.read();
            if (read == 46) {
                list.add(33);
            } else {
                list.add(read);
            }
        }
        fileReader.close();

        for (int i = 0; i < list.size(); i++) {
            //由于fileReader读取的直接为ascll码，所以通过(char) (list.get(i) + 0)转换为字符打印
            fileWriter.write((char) (list.get(i) + 0));
        }
        fileWriter.close();
    }
}
