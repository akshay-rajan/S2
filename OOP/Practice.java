public class Practice {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2020);
        
        System.out.println(car.getModel());

    }
}

class Car {

    private String make;
    private String model;
    private int year;

    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}