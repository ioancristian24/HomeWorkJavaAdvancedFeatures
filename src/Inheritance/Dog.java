package Inheritance;

public class Dog extends Animal {

    private String color;

    public Dog(int age, String vegetarian, int numberOfLegs, String color) {
        super(age, vegetarian, numberOfLegs);
        this.color = color;
    }

    public Dog() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark (){
        System.out.println(" Dog is barking ");
    }

    @Override
    public String toString (){
        return super.toString() + " culoare blanei: " + this.getColor() + ";";
    }
}
