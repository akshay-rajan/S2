public class Practice {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        
        System.out.println(car1);
        System.out.println(car2);
        
        car1.copy(car2);

        System.out.println(car1);
        System.out.println(car2);




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

    // Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);;
        this.setYear(year);
    }

    // Copy method
    public void copy(Car car) {
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }

    public String toString() {
        return "Make: " + this.getMake() + " Model: " + this.getModel() + " Year: " + this.getYear();
    }

}