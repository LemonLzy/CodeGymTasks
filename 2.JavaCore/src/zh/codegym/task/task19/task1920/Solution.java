package zh.codegym.task.task19.task1920;

/* 
首富
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        //使用treemap默认排序
        Map<String, Double> map = new TreeMap<>();

        while (fileReader.ready()) {
            String str = fileReader.readLine();
            String[] split = str.split(" ");
            Double a = map.get(split[0]);
            Double b = Double.valueOf(split[1]);
            if (map.containsKey(split[0])) {
                map.put(split[0], a + b);
            } else {
                map.put(split[0], b);
            }
        }
        fileReader.close();

        double max = 0;
        for (Double value : map.values()) {
            max = Math.max(max, value);
        }

        for (Map.Entry<String, Double> stringDoubleEntry : map.entrySet()) {
            if (stringDoubleEntry.getValue() == max) {
                System.out.println(stringDoubleEntry.getKey());
            }
        }
    }
}
