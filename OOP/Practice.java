public class Practice {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2020);
        
        System.out.println(car.getModel());

        car.setModel("Corolla");
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

}