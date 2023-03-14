package ss7_abstract_class_and_interface.exercise.colorable;

import ss7_abstract_class_and_interface.exercise.develop.Circle;
import ss7_abstract_class_and_interface.exercise.develop.Rectangle;
import ss7_abstract_class_and_interface.exercise.develop.Shape;
import ss7_abstract_class_and_interface.exercise.develop.Square;

public class ShapeList {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(5);
        shapes[3] = new Rectangle(7,8);
        shapes[4] = new Circle(4);

        for(Shape shape: shapes){
            System.out.println("Area: "+ shape.getArea());
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }

    }
}
