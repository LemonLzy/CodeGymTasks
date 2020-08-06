package zh.codegym.task.task18.task1821;

/* 
符号频率
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        Map<Integer, Integer> map = new HashMap<>();

        //读取文件，没读取一个字符判断一次，当map中存在该key(读取的字符)时，将value+1，若不存在该key，则存入该map
        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read();
            if (map.containsKey(read)) {
                int num = map.get(read) + 1;
                map.put(read, num);
            } else {
                map.put(read, 1);
            }
        }
        fileInputStream.close();

        Map<Integer, Integer> sortMap = new TreeMap<>(new MapKeyComparator());
        sortMap.putAll(map);

        //由于fileInputStream读取的直接为ascll码，所以通过(char) (integerIntegerEntry.getKey() + 0)转换为字符打印
        for (Map.Entry<Integer, Integer> integerIntegerEntry : sortMap.entrySet()) {
            System.out.println((char) (integerIntegerEntry.getKey() + 0) + " " + integerIntegerEntry.getValue());
        }

    }

    //按map的key的升序进行排序
    static class MapKeyComparator implements Comparator<Integer> {
        public int compare(Integer str1, Integer str2) {
            return str1.compareTo(str2);
        }
    }
}
