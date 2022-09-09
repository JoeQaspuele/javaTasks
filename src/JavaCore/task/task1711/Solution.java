package JavaCore.task.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String name1, name2, sex1, sex2, bd1, bd2;
        int id1, id2;

        for (String arg : args) {
            switch (arg) {
                case "-c" :
                        createPersons(args[1], args[2], args[3], args[4], args[5], args[6]);
                    break;
                case "-u" :
                    break;
                case "-d":
                    break;
                case "-i":
                    break;
            }
        }


    }

    private static void createPersons(String name1, String sex1, String bd1, String name2, String sex2, String bd2) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd1);
        if (sex1.equalsIgnoreCase("м"))
            allPeople.add(Person.createMale(name1, date));

        if (sex1.equalsIgnoreCase("ж"))
            allPeople.add(Person.createFemale(name1, date));


    }
}
