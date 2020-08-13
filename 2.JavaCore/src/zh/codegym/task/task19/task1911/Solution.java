package zh.codegym.task.task19.task1911;

/* 
Reader 包装类
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
        String upperCase = result.toUpperCase();
        System.out.println(upperCase);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("这是用于测试的文本");
        }
    }
}
