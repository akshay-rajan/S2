public class Practice {
    public static void main(String[] args) {

        Car car = new Car(4);
        System.out.println(car);
        

    }
}

abstract class Vehicle {

    // private String name;
    // private double weight;

    abstract void go();

}

class Car extends Vehicle {
    private int seats;

    public Car(int seats) {
        this.seats = seats;
    }

    public void go() {
        System.out.println("Car is going");
    }

    public String toString() {
        return super.toString() + ", Seats: " + seats;
    }
}
