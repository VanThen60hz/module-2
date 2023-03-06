package ss5_access_modifier_and_static_method_and_static_property.exercise.Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius:" + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
