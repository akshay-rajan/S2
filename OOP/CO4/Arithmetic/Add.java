package Arithmetic;

public class Add implements Operations {

    double a;
    double b;

    public Add(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double operate() {
        return a + b;
    }

}