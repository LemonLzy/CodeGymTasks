package zh.codegym.task.task16.task1621;

/* 
Thread.currentThread 始终返回当前线程
*/

public class Solution {

    static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = Thread.currentThread(); // 应将当前线程赋值给变量 t
            String name = t.getName();
            System.out.println("名称=" + name);
            // 在此添加睡眠
            Thread.sleep(1);
        }
    }
}
