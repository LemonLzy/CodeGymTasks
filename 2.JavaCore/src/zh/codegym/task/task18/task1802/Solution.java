package zh.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
数量最小的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(filename);

        List<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

        System.out.println(Collections.min(list));
    }
}

