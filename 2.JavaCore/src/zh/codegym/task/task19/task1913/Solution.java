package zh.codegym.task.task19.task1913;

/* 
仅输出数字
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
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
        String number = result.replaceAll("[^0-9]", "");
        System.out.println(number);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
