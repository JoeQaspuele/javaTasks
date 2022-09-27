package JavaCore.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        while (true) {
            BufferedReader  input = new BufferedReader(new InputStreamReader(System.in));
            String filePath = input.readLine();
            String file = null;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                file = reader.readLine();

            } catch (FileNotFoundException f) {
                System.out.println(filePath);
                input.close();
                return;
            }

        }

    }
}
