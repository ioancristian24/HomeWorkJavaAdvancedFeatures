package Inheritance;

public class Main1 {

    public static void main(String[] args) {

        Animal animal = new Animal(10, "vegetarian", 4);

        System.out.println(" Animalul are " + animal.getAge() + " ani" + ", este "
                + animal.getVegetarian() + " si are " + animal.getNumberOfLegs() + " picioare.");


        Animal dog = new Dog(10, "carnivor", 4, "cenusie");

        System.out.println(" Cainele are " + dog.getAge() + " ani" + ", este "
                + dog.getVegetarian() + ", are " + dog.getNumberOfLegs() + " picioare " + "si blana " + dog.getColor() + ".");

        ((Dog) dog).bark();

        ((Animal) dog).bark();

        Animal animal1 = new Animal(5, "vegetarian", 2);

        Animal dog1 = new Dog(4, "carnivor", 4, "neagra");

        System.out.println(animal1.toString());

        System.out.println(dog1.toString());


    }

    public void display(Animal animal) {
        System.out.println(animal.toString());
    }

    public void display1(Animal dog){
        System.out.println(dog.toString());
    }

}
