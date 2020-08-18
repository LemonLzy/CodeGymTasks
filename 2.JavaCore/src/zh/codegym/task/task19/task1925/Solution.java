package zh.codegym.task.task19.task1925;

/* 
长字词
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder temp = new StringBuilder();

        while (fileReader.ready()) {
            String str = fileReader.readLine();
            //"\\s"表示以单词做分割
            String[] split = str.split("\\s");

            for (String s : split) {
                if (s.length() > 6) {
                    temp.append(s).append(",");
                }
            }
        }
        fileWriter.write(temp.substring(0, temp.length() - 1));
        fileReader.close();
        fileWriter.close();
    }
}
