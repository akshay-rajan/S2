// 4. Write a program that reads from a file having integers. Copy even numbers and odd numbers to separate files.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Numbers {
    
    public static void main(String[] args) {
        
        try {
            FileWriter w = new FileWriter("nums.txt");
            for (int i = 0; i < 100; i += 3) {
                w.write(Integer.toString(i) + "\n");
            }
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
