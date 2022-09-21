package folder_1.Stream.PrintStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream filePrintStream = new PrintStream
                ("/Users/romanpikalov/IdeaProjects/javaTasks/src/folder_1/Stream/PrintStream/test.txt");

        filePrintStream.println("test1");
        filePrintStream.println("sex");
        filePrintStream.print("+");
        filePrintStream.print("test3");

        filePrintStream.close();

        PrintStream printStream = new PrintStream
                ("/Users/romanpikalov/IdeaProjects/javaTasks/src/folder_1/Stream/PrintStream/text2.txt");
        printStream.println("Hello");
        printStream.println("World!");

        printStream.printf("My name is %s, my age is %d!", "Amigo", 20);

        printStream.close();


    }
}
