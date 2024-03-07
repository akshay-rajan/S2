public class Practice {

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        Vehicle[] arr = {car, bicycle};

        for (Vehicle v : arr) {
            v.drive();
        }
        
    }
}

abstract class Vehicle {
    abstract void drive();
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Bicycle driving");
    }
}