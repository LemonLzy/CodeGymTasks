package zh.codegym.task.task16.task1617;

/* 
比赛倒计时
*/
public class Solution {

    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //在此编写你的代码
        if (numSeconds == 3) {
            System.out.println("3 2 1 跑！");
        }
        if (numSeconds == 4) {
            System.out.println("4 3 2 1 已中断！");
        }
        if (numSeconds == 1) {
            System.out.println("跑！");
        }
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //在此编写你的代码
            try {
                while (true) {
                    numSeconds--;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignore) {
                ignore.printStackTrace();
            }
        }
    }
}
