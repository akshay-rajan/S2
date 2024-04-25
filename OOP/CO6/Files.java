// 2. Write a program to write to a file, then read from the file and display the contents on the console.

import java.nio.file.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    
    public static void main(String[] args) {
    
        try {
            
            // Read file path
            Scanner sc = new Scanner(System.in);
            System.out.print("Path: ");
            String path = sc.nextLine();
            sc.close();

            // * Check for existence
            File f = new File(path);
            if (!(f.exists() && f.isFile())) {
                System.out.println("Not a file!");
                return;
            }

            // ! Write
            FileWriter writer = new FileWriter(path);
            writer.write("Hello, ");
            writer.append("world!");
            System.out.println("Write to " + path + " Success!");
            writer.close();

            // ! Read
            FileReader reader = new FileReader(path);
            int line = reader.read();
            while (line != -1) {
                System.out.print((char) line);
                line = reader.read();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
