package zh.codegym.task.task19.task1908;

/* 
挑选数字
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();


        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        Pattern patten = Pattern.compile("^\\d+$");
        String result = "";

        while (fileReader.ready()) {
            String read = fileReader.readLine();
            String[] split = read.split(" ");
            for (String s : split) {
                Matcher matcher = patten.matcher(s);
                if (matcher.find()) {
                    result = result.concat(matcher.group() + " ");
                }
            }
        }
        fileWriter.write(result.substring(0, result.length() - 1));

        fileReader.close();
        fileWriter.close();
    }
}
