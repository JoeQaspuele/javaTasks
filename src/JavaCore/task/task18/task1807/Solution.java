package JavaCore.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bfr.readLine();
        FileInputStream fis  = new FileInputStream(fileName);

        int count = 0;
        int value = 44;

        while (fis.available() > 0) {
            if (fis.read() == value) {
                count++;
            }
        }
        System.out.println(count);

        bfr.close();
        fis.close();
    }
}
