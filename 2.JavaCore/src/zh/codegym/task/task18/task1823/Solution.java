package zh.codegym.task.task18.task1823;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
线程和字节
*/

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String file = reader.readLine();
            if (file.equals("退出") || file.isEmpty()) {
                break;
            } else {
                ReadThread readThread = new ReadThread(file);
                readThread.start();
            }
        }
    }

    public static class ReadThread extends Thread {
        private final String filename;

        public ReadThread(String fileName) {
            // 实现构造方法主体
            this.filename = fileName;
        }

        // 在此实现文件读取
        @Override
        public void run() {
            try {
                FileInputStream in = new FileInputStream(this.filename);

                HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
                int data;
                int count;
                while (in.available() > 0) {
                    data = in.read();
                    if (isTrue(data, map)) {
                        count = map.get(data);
                        map.put(data, ++count);
                    } else {
                        map.put(data, 1);
                    }
                }
                in.close();
                int max = 0;
                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    max = Math.max(max, pair.getValue());
                }
                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    if (pair.getValue() == max)
                        resultMap.put(filename, pair.getKey());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static Boolean isTrue(Integer a, HashMap<Integer, Integer> map) {
            for (Integer key : map.keySet()) {
                if (a.equals(key)) {
                    return true;
                }
            }
            return false;
        }
    }
}
