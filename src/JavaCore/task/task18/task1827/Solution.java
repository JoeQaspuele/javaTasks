package JavaCore.task.task18.task1827;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
Прайсы
CRUD для таблицы внутри файла.
Напиши программу, которая считывает с консоли путь к файлу для операций CRUD и при запуске со следующим набором параметров:
-c productName price quantity
добавляет товар с заданными параметрами с новой строки в конец файла, генерируя id (8 символов) самостоятельно путем инкремента максимального id, найденного в файле.

Значения параметров:
-c - флаг, который означает добавления товара.
productName - название товара, 30 символов.
price - цена, 8 символов.
quantity - количество, 4 символа.

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity

Данные дополнены пробелами до их длины.

Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.

Пример содержимого файла:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234


Requirements:
1. Программа должна считать имя файла для операций CRUD с консоли.
2. В классе Solution не должны быть использованы статические переменные.
3. При запуске программы без параметров список товаров должен остаться неизменным.
4. При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
5. Товар должен иметь следующий id, после максимального, найденного в файле.
6. Форматирование новой строки товара должно четко совпадать с указанным в задании.
7. Созданные для файлов потоки должны быть закрыты.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // создаем коллекцию, которая будет содержать объекты класса Shop
        List<Shop> shopList = new ArrayList<>();

        //1 пункт условия - вызов созданного метода, который считает адрес файла с консоли
        String uriFileName = readFile();

        // Записываем в строку входящие аргументы и проверяем на null
        String arg = null;
        if (args[0] != null) arg = args[0];
        assert arg != null;


        Shop shop = new Shop();
        shop.setId((getId(uriFileName)));
        shop.setProductName(getName(args[1]));
        shop.setPrice(getPrice(args[2]));
        shop.setQuantity(getQuantity(args[3]));

        shopList.add(shop);

        String valueList = String.valueOf(shopList.get(shopList.size()-1));


        BufferedWriter writer = new BufferedWriter(new FileWriter(uriFileName,true));
        writer.newLine();
        writer.write(valueList);
        writer.flush();
        writer.close();

    }

    private static String getQuantity(String count) {
        StringBuilder builder = new StringBuilder();
        builder.append(count);
        if(builder.length() < 4) while (builder.length() < 8) builder.append(" ");

        return new String(builder).substring(0, 4);
    }

    private static String getPrice(String price) {
        StringBuilder builder = new StringBuilder();
        builder.append(price);
        if (builder.length() < 8) while (builder.length() < 8) builder.append(" ");

        return new String(builder).substring(0, 8);
    }

    private static String getName(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        if (builder.length() < 30) while (builder.length() < 30) builder.append(" ");

        return new String(builder).substring(0, 30);
    }

    /*
    private static String getId(String uriFileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uriFileName));
        char[] id = new char[8];
        String idValue;
        if (reader.ready()) {
            reader.read(id, 0 , 8);
            // переписываем в строку наш id
            idValue = String.valueOf(id);
            int integer = new Integer(idValue);
            integer += 300;
            String zero = "0000000" + integer;
            idValue = zero.substring(zero.length() - 8);
        } else {
            idValue = "00000001";
        }
        reader.close();
        return idValue;
    }

     */

    private static String getId(String uriFileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uriFileName));
        char[] id = new char[8];
        String idValue;
        StringBuilder builder = new StringBuilder();
        if (reader.ready()) {
            int i = reader.read(id, 0 , 8);
            // переписываем в строку наш id
            idValue = String.valueOf(id).trim();

           Integer increment = Integer.parseInt(idValue) + 1;
           builder.append(increment);
           builder.append("       ");
           idValue = String.valueOf(builder);
        } else {
            idValue = "1       ";
        }
        reader.close();
        return idValue.substring(0, 8);
    }



    private static String readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = reader.readLine();
        reader.close();
        return result;

    }
}
