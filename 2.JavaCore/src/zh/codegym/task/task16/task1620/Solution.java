package zh.codegym.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/*
一生万物，万物归一
*/

public class Solution {

    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        //在此编写你的代码
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("水");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {

        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //修复 2 个变量
            boolean isCurrentThreadInterrupted = false;
            String threadName = "";

            Thread thread = Thread.currentThread();
            isCurrentThreadInterrupted = thread.isInterrupted();

            try {
                while (!isCurrentThreadInterrupted) {
                    System.out.println("对象 " + sharedResource + "，线程 " + thread.getName());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignored) {
            }
        }
    }
}