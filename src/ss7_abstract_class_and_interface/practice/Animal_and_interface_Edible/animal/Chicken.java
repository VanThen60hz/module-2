package ss7_abstract_class_and_interface.practice.Animal_and_interface_Edible.animal;

import ss7_abstract_class_and_interface.practice.Animal_and_interface_Edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";

    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
