// 4. Write a program that reads from a file having integers. Copy even numbers and odd numbers to separate files.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Numbers {
    
    public static void main(String[] args) {
        
        try {

            // To read line by line
            FileReader reader = new FileReader("integers.txt");
            BufferedReader integers = new BufferedReader(reader);

            FileWriter even = new FileWriter("integers-even.txt");
            FileWriter odd = new FileWriter("integers-odd.txt");

            String line = integers.readLine();
            while (line != null) {
                int num = Integer.valueOf(line);
                
                // Write to different files according to the parity
                if (num % 2 == 0) {
                    even.write(Integer.toString(num) + "\n");
                } else {
                    odd.write(Integer.toString(num) + "\n");
                }

                System.out.println(num);
                line = integers.readLine();
            }

            integers.close();
            even.close();
            odd.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
