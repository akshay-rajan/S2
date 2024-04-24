package Arithmetic;

public class Sub implements Operations {

    double a;
    double b;

    public Sub(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double operate() {
        return a - b;
    }

}