package JavaCore.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
            ArrayList<Integer> values = new ArrayList<>();
            try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis  = new FileInputStream(bfr.readLine())) {

                while (fis.available() > 0) values.add(fis.read());

            }

            HashSet<Integer> integers = new HashSet<>(values);
            values.clear();
            values.addAll(integers);


            for (int i : values) System.out.print(i + " ");

    }
}
