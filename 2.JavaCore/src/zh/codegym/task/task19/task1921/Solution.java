package zh.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
约翰 约翰逊
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));

        while (fileReader.ready()) {
            String str = fileReader.readLine();

            String name = str.replaceAll("[0-9]", "").trim();
            String birth = str.replaceAll("[^0-9 ]", "").trim();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
            Date date = simpleDateFormat.parse(birth);

            Person person = new Person(name, date);
            PEOPLE.add(person);
        }
        fileReader.close();
    }
}
