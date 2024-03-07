import java.io.FileWriter;
import java.io.IOException;

public class Practice {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello World \n I am new here!");
            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

        
    }
}
