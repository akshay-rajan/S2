package Arithmetic;

public class Div implements Operations {

    double a;
    double b;

    public Div(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double operate() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }

}