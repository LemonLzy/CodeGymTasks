package zh.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
对字节排序
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(filename);

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            set.add(fileInputStream.read());
        }
        fileInputStream.close();

        list.addAll(set);

        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
