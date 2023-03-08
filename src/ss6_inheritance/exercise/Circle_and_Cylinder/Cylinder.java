package ss6_inheritance.exercise.Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 5.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + super.toString() +
                '}';
    }
}
