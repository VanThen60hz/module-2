package ss4_class_and_object.exercise.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } else {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } else {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        }
    }
}
