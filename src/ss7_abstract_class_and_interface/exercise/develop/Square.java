package ss7_abstract_class_and_interface.exercise.develop;

import ss7_abstract_class_and_interface.exercise.colorable.Colorable;
import ss7_abstract_class_and_interface.exercise.develop.Shape;
import ss7_abstract_class_and_interface.exercise.resizeable.Resizeable;

public class Square extends Shape implements Resizeable, Colorable {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }

    @Override
    public void resize(int percent) {
        edge *= (1 + percent / 100.0);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
