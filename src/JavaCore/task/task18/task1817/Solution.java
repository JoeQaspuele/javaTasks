package JavaCore.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        StringBuilder builder = new StringBuilder();
        while (reader.ready()) {
            builder.append(reader.readLine());
        }
        double countSymbols = builder.toString().length();
        double countSpace = 0;
        for (char ch : builder.toString().toCharArray())  {
            if (ch == ' ') {
                countSpace++;
            }
        }

        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println(format.format(countSpace/countSymbols*100));

        reader.close();
    }
}
