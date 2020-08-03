package zh.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
事务性
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //从控制台读取两个文件名
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        //根据文件名将数据存入不同的list
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(new File(file1)));
        while (bufferedReader1.ready()) {
            allLines.add(bufferedReader1.readLine());
        }
        bufferedReader1.close();

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(file2)));
        while (bufferedReader2.ready()) {
            linesForRemoval.add(bufferedReader2.readLine());
        }
        bufferedReader2.close();

        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
