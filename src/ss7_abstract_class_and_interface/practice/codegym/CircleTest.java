package ss7_abstract_class_and_interface.practice.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.5);
        System.out.println(circle);

        circle = new Circle("black",false,2.5);
        System.out.println(circle);
    }
}
