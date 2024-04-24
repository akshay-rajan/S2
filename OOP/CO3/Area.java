// 1. Area of different shapes using overloaded functions

import java.util.Scanner;

public class Area {

    // Overloaded methods
    static double area(Circle c) {
        return 3.14 * c.radius * c.radius;
    }
    static double area(Rectangle r) {
        return r.length * r.breadth;
    }
    static double area(Square s) {
        return s.side * s.side;
    }
    static double area(Triangle t) {
        return 0.5 * t.base * t.height;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        Circle circle = new Circle(sc.nextInt());
        System.out.println("Area of the circle: " + area(circle));

        System.out.print("Enter the side of the square: ");
        Square square = new Square(sc.nextInt());
        System.out.println("Area of the square: " + area(square));

        System.out.print("Enter the length and breadth of the rectangle: ");
        Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());
        System.out.println("Area of the rectangle: " + area(rectangle));

        System.out.print("Enter the base and height of the triangle: ");
        Triangle triangle = new Triangle(sc.nextInt(), sc.nextInt());
        System.out.println("Area of the triangle: " + area(triangle));
        sc.close();

    }

}

class Circle {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }
    
}
class Square {

    int side;

    Square(int side) {
        this.side = side;
    }

}
class Rectangle {

    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}
class Triangle {

    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

}