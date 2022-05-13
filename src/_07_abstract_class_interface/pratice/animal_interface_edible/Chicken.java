package _07_abstract_class_interface.pratice.animal_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : Cluk - cluk ! " ;
    }

    @Override
    public String howToEat() {
        return "Could be fried !";
    }
}
