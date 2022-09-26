package JavaCore.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName_1, fileName_2;


        BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
        fileName_1 = readConsole.readLine();
        fileName_2 = readConsole.readLine();
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader_1 = new BufferedReader(new FileReader(fileName_1));
             BufferedReader reader_2 = new BufferedReader(new FileReader(fileName_2))) {
            while (reader_2.ready()) {
                builder.append(reader_2.readLine());
            }
            while (reader_1.ready()) {
                builder.append(reader_1.readLine());
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName_1));
            writer.write(builder.toString());
            writer.flush();
            writer.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
