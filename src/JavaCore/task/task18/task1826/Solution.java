package JavaCore.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {

        switch (args[0]) {
            case "-e":
                encryption(args[1], args[2]);
                break;
            case "-d":
                decoding(args[1], args[2]);
                break;
        }
    }

    private static void encryption(String fileName, String stream) {
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            FileOutputStream outputStream = new FileOutputStream(stream);
            while (inputStream.available() > 0) {
                outputStream.write(inputStream.read()+20);
            }

            outputStream.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void decoding(String fileName, String stream) {
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            FileOutputStream outputStream = new FileOutputStream(stream);

            while (inputStream.available() > 0) {
                outputStream.write(inputStream.read()-20);
            }

            inputStream.close();
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
