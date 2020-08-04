package zh.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
一个列表和几个线程
*/

public class Solution {

    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //在此编写你的代码
        SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();
        SpecialThread specialThread5 = new SpecialThread();

        Thread thread1 = new Thread(specialThread1);
        Thread thread2 = new Thread(specialThread2);
        Thread thread3 = new Thread(specialThread3);
        Thread thread4 = new Thread(specialThread4);
        Thread thread5 = new Thread(specialThread5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("这是 SpecialThread 内的 run 方法");
        }
    }
}
