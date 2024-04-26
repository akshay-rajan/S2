// 3. Write a program to copy one file to another.

import java.nio.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.annotation.processing.FilerException;


public class CopyFiles {
    
    public static void main(String[] args) {
        
        try {
            // Read from f1 and write into f2
            FileReader f1 = new FileReader("file1.txt");
            FileWriter f2 = new FileWriter("file2.txt");

            int line = f1.read();
            while (line != -1) {
                System.out.print((char) line);
                f2.write(line);
                line = f1.read();
            }

            f1.close();
            f2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
