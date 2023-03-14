package ss7_abstract_class_and_interface.exercise.resizeable;

import ss7_abstract_class_and_interface.exercise.develop.Circle;
import ss7_abstract_class_and_interface.exercise.develop.Rectangle;
import ss7_abstract_class_and_interface.exercise.develop.Shape;
import ss7_abstract_class_and_interface.exercise.develop.Square;

import java.util.Random;

public class ShapeList {
    public static void main(String[] args) {
        Random rand = new Random();

        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(5);
        shapes[3] = new Rectangle(7,8);
        shapes[4] = new Circle(4);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " area before: " + shapes[i].getArea());

            int randomFactor = rand.nextInt(100) + 1;
            if(shapes[i] instanceof Circle){
                ((Circle) shapes[i]).resize(randomFactor);
            }else if(shapes[i] instanceof Square){
                ((Square) shapes[i]).resize(randomFactor);
            }else{
                ((Rectangle) shapes[i]).resize(randomFactor);
            }
            System.out.println("Shape " + (i + 1) + " area after scaling by " + randomFactor + "%: " + shapes[i].getArea());
            System.out.println();
        }
    }
}