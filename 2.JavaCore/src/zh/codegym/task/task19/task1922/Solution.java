package zh.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
搜索正确的行
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("文件");
        words.add("查看");
        words.add("在");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(filename));

        int wordCount = 0;

        while (fileReader.ready()) {
            String str = fileReader.readLine();
            String[] split = str.split(" ");

            for (String s : split) {
                for (String word : words) {
                    if (s.matches(word)) {
                        wordCount++;
                    }
                }
            }

            if (wordCount == 2) {
                System.out.println(str);
            }
            wordCount = 0;
        }
        fileReader.close();
    }
}
