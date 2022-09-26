package JavaCore.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file_1, file_2;

        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        file_1 = readerConsole.readLine();
        file_2 = readerConsole.readLine();

        readerConsole.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(file_1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file_2, true))) {
            String line = null;
            while (reader.ready()) {
                line = reader.readLine();
            }
            assert line != null;
            for (char c : line.toCharArray()) {
                if (c != ' ') {
                    builder.append(c);
                } else {
                    list.add(builder.toString());
                    builder.delete(0, builder.length());
                }
            }
            list.add(builder.toString());

            for (String str :  list) {
                writer.write(Math.round(Float.parseFloat(str))+ " ");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
