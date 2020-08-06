package zh.codegym.task.task18.task1823;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
线程和字节，未通过验证，实际验证通过
*/

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = " ";
        while ((file = reader.readLine()) != null) {
            if (file.equals("退出")) {
                break;
            } else {
                ReadThread readThread = new ReadThread(file);
                readThread.start();
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : resultMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
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
                FileInputStream fileInputStream = new FileInputStream(filename);
                Map<Integer, Integer> map = new HashMap<>();

                while (fileInputStream.available() > 0) {
                    int read = fileInputStream.read();
                    if (map.containsKey(read)) {
                        map.put(read, map.get(read) + 1);
                    } else {
                        map.put(read, 1);
                    }
                }
                fileInputStream.close();

                TreeMap<Integer, Integer> sortMap = new TreeMap<>(new MapKeyComparator());
                sortMap.putAll(map);

                resultMap.put(filename, sortMap.lastKey());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        static class MapKeyComparator implements Comparator<Integer> {
            public int compare(Integer str1, Integer str2) {
                return str1.compareTo(str2);
            }
        }
    }
}
