package zh.codegym.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
构建文件
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        FileOutputStream fos = null;
        TreeSet<String> set = new TreeSet<>();

        while (true) {
            String path = reader.readLine();
            if (path.equals("结束") || path.equals("end")) {
                break;
            }
            set.add(path);
        }

        while (set.size() > 0) {
            String path = set.pollFirst();
            if (fileName == null) {
                fileName = path.substring(0, path.length() - 6);
                fos = new FileOutputStream(fileName);
            }

            byte[] data = new byte[1024];
            int len;
            FileInputStream fis = new FileInputStream(path);
            while ((len = fis.read(data)) > 0) {
                fos.write(data, 0, len);
            }
            fis.close();
        }
        fos.close();
        reader.close();
    }
}
