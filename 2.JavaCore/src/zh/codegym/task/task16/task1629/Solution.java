package zh.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //在此编写你的代码
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //在此编写你的代码
    public static class Read3Strings extends Thread {
        String str = "";
        @Override
        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Thread thread = Thread.currentThread();
            while (!thread.isInterrupted()) {
                try {
                    String s = bufferedReader.readLine();
                    String s1 = bufferedReader.readLine();
                    String s2 = bufferedReader.readLine();
                    str = s + " " + s1 + " " + s2;
                    return;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printResult() {
            System.out.println(str);;
        }
    }
}
