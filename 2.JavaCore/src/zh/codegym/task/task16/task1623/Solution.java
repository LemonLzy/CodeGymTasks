package zh.codegym.task.task16.task1623;

/* 
以递归方式创建线程
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run() {
            if (createdThreadCount < Solution.count) {
                GenerateThread generateThread = new GenerateThread();
                System.out.println(generateThread);
            } else {
                System.out.println("已创建所有 15 个线程");
            }
        }

        @Override
        public String toString() {
            return  createdThreadCount + " 已创建";
        }
    }
}