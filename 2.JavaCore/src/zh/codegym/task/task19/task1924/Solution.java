package zh.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
替换数字
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "零");
        map.put(1, "一");
        map.put(2, "二");
        map.put(3, "三");
        map.put(4, "四");
        map.put(5, "五");
        map.put(6, "六");
        map.put(7, "七");
        map.put(8, "八");
        map.put(9, "九");
        map.put(10, "十");
        map.put(11, "十一");
        map.put(12, "十二");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        while (fileReader.ready()) {
            String str = fileReader.readLine();
            for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
                str = str.replaceAll("\\b" + integerStringEntry.getKey() + "\\b", integerStringEntry.getValue());
            }
            System.out.println(str);
        }
        fileReader.close();
    }
}
