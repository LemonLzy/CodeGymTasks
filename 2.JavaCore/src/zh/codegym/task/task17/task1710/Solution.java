package zh.codegym.task.task17.task1710;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {

    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("唐纳德·坎普", new Date()));  // id=0
        allPeople.add(Person.createMale("拉里·盖茨", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // 在这里开始

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");

        try {
            if (args[0].equals("-c")) {

                Date date = simpleDateFormat.parse(args[3]);

                if (args[2].equals("m"))
                    allPeople.add(Person.createMale(args[1], date));
                else if (args[2].equals("f"))
                    allPeople.add(Person.createFemale(args[1], date));
                else
                    return;
                System.out.println(allPeople.size() - 1);
            } else if (args[0].equals("-u")) {
                Date date = simpleDateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                if (args[3].equals("m"))
                    allPeople.set(id, Person.createMale(args[2], date));
                else if (args[3].equals("f"))
                    allPeople.set(id, Person.createFemale(args[2], date));
                else
                    return;
            } else if (args[0].equals("-d")) {
                int id = Integer.parseInt(args[1]);
                //allPeople.set(id, null);
                allPeople.get(id).setSex(null);
                allPeople.get(id).setBirthDate(null);
                allPeople.get(id).setName(null);
            } else if (args[0].equals("-i")) {
                int id = Integer.parseInt(args[1]);
                String sex = null;
                if (allPeople.get(id).getSex().equals(Sex.MALE))
                    sex = "m";
                else if (allPeople.get(id).getSex().equals(Sex.FEMALE))
                    sex = "f";
                String tmp = new SimpleDateFormat("MMM dd yyyy").format(allPeople.get(id).getBirthDate());
                System.out.println(allPeople.get(id).getName() + " " + sex + " " + tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
