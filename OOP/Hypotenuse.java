import java.util.Scanner;

public class Hypotenuse {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altitude: ");
        double altitude = sc.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(altitude, 2));
        System.out.println("Hypotenuse: " + hypotenuse);
        sc.close();
    }

}
