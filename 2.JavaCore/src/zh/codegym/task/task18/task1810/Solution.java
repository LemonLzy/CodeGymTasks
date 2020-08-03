package zh.codegym.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String filename = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(filename);
            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                break;
            }
        }
        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
