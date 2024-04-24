package Arithmetic;

public class Mul implements Operations {

    double a;
    double b;

    public Mul(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double operate() {
        return a * b;
    }

}