package zh.codegym.task.task19.task1923;

/* 
包含数字的字词
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);

        while (fileReader.ready()) {
            String str = fileReader.readLine();
            String[] split = str.split(" ");

            for (String s : split) {
                char[] chars = s.toCharArray();
                for (char aChar : chars) {
                    if ((aChar >= 48) && (aChar <= 57)) {
                        fileWriter.write(s + " ");
                        break;
                    }
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
