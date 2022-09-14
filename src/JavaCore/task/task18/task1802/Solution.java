package JavaCore.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(bf.readLine());
        int minValue = Integer.MAX_VALUE;
        while (fis.available() > 0) {
            int currentValue = fis.read();
            if (currentValue < minValue) minValue = currentValue;

        }
        System.out.println(minValue);
        bf.close();
        fis.close();
    }
}
