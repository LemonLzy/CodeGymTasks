package zh.codegym.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
计算秒数
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        // 创建并运行线程
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        // 读取字符串
        reader.readLine();
        stopwatch.interrupt();
        //关闭流
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {

        private int seconds;

        public void run() {
            try {
                //在此编写你的代码
                Thread thread = Thread.currentThread();
                while (!thread.isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
