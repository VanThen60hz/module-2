package ss7_abstract_class_and_interface.practice.implement_Comparable_interface_for_geometry_classes;


import ss7_abstract_class_and_interface.practice.codegym.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()) return 1;
        return 0;
    }
}
