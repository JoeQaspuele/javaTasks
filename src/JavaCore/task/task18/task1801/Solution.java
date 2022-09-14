package JavaCore.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bf.readLine());
        int maxInt = Integer.MIN_VALUE;
        while (fileInputStream.available() > 0) {
            int value  = fileInputStream.read();
            if (value > maxInt) {
                maxInt = value;
            }
        }
        System.out.println(maxInt);
        bf.close();
        fileInputStream.close();
    }
}
