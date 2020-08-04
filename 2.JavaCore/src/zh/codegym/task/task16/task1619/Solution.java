package zh.codegym.task.task16.task1619;

/* 
无中断，没门？
*/

public class Solution {

    public static boolean interrupt = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        interrupt = true;
    }

    public static class TestThread implements Runnable {

        public void run() {
            while (!interrupt) {
                try {
                    System.out.println("呵呵");
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}