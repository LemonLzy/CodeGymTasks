package zh.codegym.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
另一个适配器
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String s = this.fileScanner.nextLine();
            String[] split = s.split(" ");

            String sdate = split[3] + " " + split[4] + " " + split[5];
            Date date = null;

            date = new SimpleDateFormat("MM dd yyyy").parse(sdate);
            Person person = new Person(split[2], split[0], split[1], date);

            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
