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

	// Static method to add two complex numbers
	public static void add(Complex c1, Complex c2) {
		Complex ans = new Complex(c1.a + c2.a, c1.b + c2.b);
		System.out.println("c1 + c2:\t" + ans);
	}
    
	public static void main(String[] args) {
		
		// Read two complex numbers
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter c1.a and c1.b: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		Complex c1 = new Complex(a, b);
		System.out.print("Enter c2.a and c2.b: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		Complex c2 = new Complex(a, b);
		sc.close();
		
		// Add the complex numbers
		System.out.println("c1:\t\t" + c1 + "\nc2:\t\t" + c2);
		Complex.add(c1, c2);

	}
}
