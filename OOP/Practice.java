import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int x;
        try {
            x = 10 / n;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        
    }
}
