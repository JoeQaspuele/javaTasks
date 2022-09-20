package JavaCore.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Записать в конец файла фразу "JavaRush © All rights reserved.", используй метод getBytes().
2.3 Закрыть поток методом close().

Требования:
•	Метод main изменять нельзя.
•	Класс AmigoOutputStream должен наследоваться от класса FileOutputStream.
•	Класс AmigoOutputStream должен принимать в конструкторе объект типа FileOutputStream.
•	Все методы write(), flush(), close() в классе AmigoOutputStream должны делегировать свое выполнение объекту FileOutputStream.
•	Метод close() должен сначала вызвать метод flush(), затем записать в конец файла текст, затем закрыть поток.
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    String newText = "JavaRush © All rights reserved.";

    private FileOutputStream fileOutputStream;


    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = name;
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
