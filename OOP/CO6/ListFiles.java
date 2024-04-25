// 1. Program to list the sub directories and files in a given directory and also search for a filename.

import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class ListFiles {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {

            System.out.print("Absolute or Relative Path: ");
            String path = sc.nextLine();
            
            // Location of the directory
            Path dir = Paths.get(path);

            // Instance of the directory
            DirectoryStream<Path> stream = Files.newDirectoryStream(dir);

            // Print each file / subdirectory in the directory
            System.err.println(path);
            for (Path file: stream)
                System.out.println("  " + file.getFileName());

            // -----------------------------------------------

            // Search for a filename
            System.out.print("FileName to find: ");
            String myFile = sc.nextLine();

            // * Labelled Block
            found: {
                for (Path file: Files.newDirectoryStream(dir)) {
                    if (file.getFileName().toString().equals(myFile)) {
                        // If 'file' is actually a directory, continue
                        if (!Files.isRegularFile(file)) continue;
                        System.out.println("File found!");
                        // * Breaks out of the entire block
                        break found;
                    }
                }
                // If no match has been found
                System.out.println("File not found!");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
    
}
