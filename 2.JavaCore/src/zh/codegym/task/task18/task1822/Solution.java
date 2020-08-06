package zh.codegym.task.task18.task1822;

/* 
查找文件中的数据
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferReader.readLine();
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader);

        String str;

        while ((str = bufferedReader2.readLine()) != null) {
            String[] temp = str.split(" ");
            if (Integer.parseInt(args[0]) == Integer.parseInt(temp[0])) {
                System.out.println(str);
            }
        }

        fileReader.close();
        bufferReader.close();
        bufferedReader2.close();
    }
}
