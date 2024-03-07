import java.io.FileWriter;
import java.io.IOException;

public class Practice {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello, World!\n");
            writer.append("Bye bye, World!");
            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

        
    }
}
