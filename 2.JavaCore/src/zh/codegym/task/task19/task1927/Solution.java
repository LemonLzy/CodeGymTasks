package zh.codegym.task.task19.task1927;

/* 
上下文广告
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
        String[] str = outputStream.toString().split("\\n");

        //将一切恢复原样
        System.setOut(consoleStream);

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            if (i % 2 == 1){
                System.out.println("CodeGym - 在线 Java 课程");
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("第一");
            System.out.println("第二");
            System.out.println("第三");
            System.out.println("第四");
            System.out.println("第五");
        }
    }
}
