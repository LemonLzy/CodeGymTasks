package zh.codegym.task.task19.task1915;

/* 
重复文本
*/

import java.io.*;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        bufferedReader.close();

        //在一个特殊变量中保存当前的 PrintStream
        PrintStream consoleStream = System.out;

        //创建动态数组
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //创建 PrintStream 类的适配器
        PrintStream printStream = new PrintStream(outputStream);
        //将其设置为当前的 System.out
        System.setOut(printStream);

        testString.printSomething();

        //将一切恢复原样
        System.setOut(consoleStream);

        String result = outputStream.toString();

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        char[] chars = result.toCharArray();
        for (char aChar : chars) {
            fileOutputStream.write(aChar);
            consoleStream.write(aChar);
        }

        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("这是用于测试的文本");
        }
    }
}

