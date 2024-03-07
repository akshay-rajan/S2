import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Vehicle v;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for car and 2 for boat: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            v = new Car();
            v.move();
        } else if (choice == 2) {
            v = new Boat();
            v.move();
        } else {
            System.out.println("Invalid choice");
        }
        
        
    }
}

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}

class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("Boat is moving");
    }
}