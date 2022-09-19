package JavaCore.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file_1, file_2;
        BufferedReader fileInputStream = new BufferedReader(new InputStreamReader(System.in));
        file_1 = fileInputStream.readLine();
        file_2 = fileInputStream.readLine();

        try (FileInputStream input_1 = new FileInputStream(file_1);
             FileOutputStream output_1 = new FileOutputStream(file_2)) {

            byte[] buffer = new byte[input_1.available()];
            if (input_1.available() > 0) {
                int count = input_1.read(buffer);
            }

            for (int x = buffer.length-1; x >= 0; x --) {
                output_1.write(buffer[x]);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
