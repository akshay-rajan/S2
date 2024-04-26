// 3. Write a program to copy one file to another.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class CopyFiles2 {

    public static void main(String[] args) {
        
        try {
            
            Path f1 = Paths.get("file1.txt");
            Path f2 = Paths.get("file2.txt");
            
            // Copy f1 to a new file f2. If f2 exists, replace it
            Files.copy(f1, f2, StandardCopyOption.REPLACE_EXISTING); 
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}