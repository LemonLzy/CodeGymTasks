package zh.codegym.task.task18.task1824;

/* 
文件和异常
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, FileInputStream> map = new HashMap<>();

        try {
            while ((filename = bufferedReader.readLine()) != null) {
                FileInputStream fileInputStream = new FileInputStream(filename);
                map.put(filename, fileInputStream);
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename);
            for (FileInputStream value : map.values()) {
                value.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
