package zh.codegym.task.task16.task1630;
import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //在此编写你的代码
    static {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //在此编写你的代码
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String result = "";
        String filename = null;

        public void run() {
            try {
                BufferedReader rt = new BufferedReader(new FileReader(filename));
                String str = null;

                while ((str = rt.readLine()) != null) {
                    result += str + " ";
                }
                rt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        public String getFileContents() {
            return result;
        }
    }
}