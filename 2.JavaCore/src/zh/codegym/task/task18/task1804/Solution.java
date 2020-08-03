package zh.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
最少的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(filename);

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

        //将list获取的字节，存入map并进行计数
        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }

        //获取重复值集合map中，重复次数最小的值
        int min = 1;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            min = Math.min(min, integerIntegerEntry.getValue());
        }

        //遍历map，将字节最小的值写入list2
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == min) {
                list2.add(integerIntegerEntry.getKey());
            }
        }

        //遍历list2，输出字节最小的值
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
    }
}

