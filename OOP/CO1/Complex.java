// 3. Add complex numbers

import java.util.Scanner;

public class Complex {
	
	double a;
	double b;

	// Constructor
	Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// String representation of a complex number
	public String toString() {
		return a + " + " + b + "i";
	}

	// Static method to add two complex numbers and return a complex number
	public static Complex add(Complex c1, Complex c2) {

        return new Complex(c1.a + c2.a, c1.b + c2.b);

    }
    
	public static void main(String[] args) {
		
		// Read two complex numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter c1.a and c1.b: ");
		Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
		System.out.print("Enter c2.a and c2.b: ");
		Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());
		sc.close();
		
		// Add the complex numbers and print the result
		System.out.println("c1:\t\t" + c1 + "\nc2:\t\t" + c2);
		Complex res = add(c1, c2);
        System.out.println("c1 + c2:\t" + res);

	}
}

