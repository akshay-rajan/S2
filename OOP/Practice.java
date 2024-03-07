import java.io.File;

public class Practice {

    public static void main(String[] args) {

        File file = new File("test.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
        System.out.println(file.delete());
        
    }
}
