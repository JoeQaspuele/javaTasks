package JavaCore.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        int id;
        String name, sex, bd;


        for (String arg : args) {
            switch (arg) {
                case "-c":
                    name = args[1];
                    sex = args[2];
                    bd = args[3];
                    Date dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
                    if (sex.equals("м")) allPeople.add(Person.createMale(name, dateFormat));
                    if (sex.equals("ж")) allPeople.add(Person.createFemale(name, dateFormat));
                    System.out.println(allPeople.size()-1);
                    break;
                case "-r":
                    id = Integer.parseInt(args[1]);
                    SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                    System.out.print(allPeople.get(id).getName() + " ");
                    if (allPeople.get(id).getSex().equals(Sex.MALE)) {
                        System.out.print("м ");
                    } else {
                        System.out.print("ж ");
                    }

                    System.out.println(dateFormat2.format(allPeople.get(id).getBirthDate()));

                    break;
                case "-u":
                    id = Integer.parseInt(args[1]);
                    name = args[2];
                    sex = args[3];
                    bd = args[4];
                    Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);

                    Person editPerson  = allPeople.get(id);
                    editPerson.setName(name);
                    if (sex.equals("м")) editPerson.setSex(Sex.MALE);
                    if (sex.equals("ж")) editPerson.setSex(Sex.FEMALE);
                    editPerson.setBirthDate(newInDate);
                    allPeople.set(id, editPerson);
                    break;
                case "-d":
                    id = Integer.parseInt(args[1]);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDate(null);
                    break;

            }
        }
    }
}
