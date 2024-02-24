import java.util.Scanner;

public class Complex {
	int a, b;

	public void print() {
		System.out.println(this.a + " + " + this.b + "i");
	}

	public void add(Complex other) {
		Complex ans = new Complex();
		ans.a = this.a + other.a;
		ans.b = this.b + other.b;
		ans.print();
	}
    
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("c1.a: ");
		c1.a = sc.nextInt();
		System.out.println("c1.b: ");
		c1.b = sc.nextInt();
		System.out.println("c2.a: ");
		c2.a = sc.nextInt();
		System.out.println("c2.b: ");
		c2.b = sc.nextInt();
		c1.print();
		c2.print();
		c1.add(c2);
		sc.close();
	}
}
