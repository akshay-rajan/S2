// 2. Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. Test the package by implementing all operations on two given numbers

import java.util.Scanner;
import Arithmetic.*;

public class ArithmeticPkg {
 
    public static void main(String[] args) {
        
        // Read two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        
        // Test the package
        Add sum = new Add(a, b);
        System.out.println(a + " + " + b + " = " + sum.operate());

        Sub difference = new Sub(a, b);
        System.out.println(a + " - " + b + " = " + difference.operate());

        Mul product = new Mul(a, b);
        System.out.println(a + " * " + b + " = " + product.operate());

        Div quotient = new Div(a, b);
        System.out.println(a + " / " + b + " = " + quotient.operate());

    }

}
