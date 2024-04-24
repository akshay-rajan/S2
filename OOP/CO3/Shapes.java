// 6. Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects.

import java.util.Scanner;

public class Shapes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Read a shape from the user and display its area and perimeter
            System.out.print("Enter 1 for Circle, 2 for Rectangle, 5 to exit: ");
            int shape = sc.nextInt();
            switch (shape) {
                case 1:
                    System.err.print("Enter the radius: ");
                    Circle c = new Circle(sc.nextInt());
                    System.out.println("Area: " + c.area());
                    System.out.println("Perimeter: " + c.perimeter());
                    break;
                case 2:
                    System.err.print("Enter the length and breadth: ");
                    Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());
                    System.out.println("Area: " + r.area());
                    System.out.println("Perimeter: " + r.perimeter());
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
        
    }

}

interface Metrics {

    // Abstract Methods
    double area();    
    double perimeter();

}

class Circle implements Metrics {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    // Overriding Abstract Methods
    public double area() {
        return 3.14 * radius * radius;
    }
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

}

class Rectangle implements Metrics {

    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding Abstract Methods
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }

}