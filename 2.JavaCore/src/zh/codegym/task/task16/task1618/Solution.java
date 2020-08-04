package zh.codegym.task.task16.task1618;

/* 
另一个中断
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //在此编写你的代码
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //在此编写你的代码
    public static class TestThread extends Thread {
        @Override
        public void run() {
            super.run();
        }
    }
}