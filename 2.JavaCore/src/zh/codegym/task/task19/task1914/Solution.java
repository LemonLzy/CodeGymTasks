package zh.codegym.task.task19.task1914;

/* 
问题解决，暂未理解此题解题思路
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        String substring = result.substring(result.length() - 2, result.length());
        if (result.contains("+")) {
            String[] words = result.split("\\+");
            double a = Double.parseDouble(words[0].replaceAll("\\=", "").trim());
            double b = Double.parseDouble(words[1].replaceAll("\\=", "").trim());
            long c = Math.round(a + b);
            String end = substring;
            result = result.substring(0, result.length() - 1) + c;

        } else if (result.contains("-")) {
            String[] words = result.split("\\-");
            int a = Integer.parseInt(words[0].replaceAll("\\D", ""));
            int b = Integer.parseInt(words[1].replaceAll("\\D", ""));
            long c = a - b;
            result = result.substring(0, result.length() - 1) + c + substring;
        } else if (result.contains("*")) {
            String[] words = result.split("\\*");
            int a = Integer.parseInt(words[0].replaceAll("\\D", ""));
            int b = Integer.parseInt(words[1].replaceAll("\\D", ""));
            long c = a * b;
            result = result.substring(0, result.length() - 1) + c + substring;
        }
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

