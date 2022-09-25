package JavaCore.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        StringBuilder builder = new StringBuilder();
        while (reader.ready()) {
            builder.append(reader.readLine());
        }

        String s = builder.toString();
        long count_1 = s.chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .count();
        long count_2 = s.chars()
                        .filter(ch -> ch >= 'A' && ch <= 'Z')
                                .count();
        long result = count_1 + count_2;
        System.out.println(result);
        reader.close();

    }
}
