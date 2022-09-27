package JavaCore.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // создаём два stringBuilder для будущего hashMap id - key и str вся остальная строка
        StringBuilder id = new StringBuilder();
        StringBuilder str = new StringBuilder();
        // создаем hashMap  с параметрами Integer, String. туда поместим данные считанные с файла
        HashMap<Integer, String> map = new HashMap<>();

        String string;
        String file;
        int key;
        int value = Integer.parseInt(args[0]);

        // Создаём поток чтения с консоли пути до файла
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        file = input.readLine();
        // создаём поток для чтения файла
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // прогоняем по циклу каждую строку из файла
        while (reader.ready()) {
            string = reader.readLine();

            // в данной ветке цикла до первого символа пробела считываем данные в типе char
            // так как мы знаем, что первые символы до пробела это наш будущий id по которому будем искать
            // и добавляем в StringBuilder id
            for(char c : string.toCharArray()) {
                if (c == ' ') {
                    break;
                }
                id.append(c);
            }
            // парсим наш id в тип данных int
            key = Integer.parseInt(String.valueOf(id));

            // добавляем в наш hashMap key (в нем id и строка с данными id productName price quantity
            map.put(key, string);
            // очищаем StringBuilder чтобы в следующей итеррации цикла он был пустой для нового id
            id.delete(0, id.length());
        }

        input.close();
        reader.close();

        System.out.println(map.get(value));
    }
}
