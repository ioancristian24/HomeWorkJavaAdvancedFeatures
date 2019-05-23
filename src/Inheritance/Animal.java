package Inheritance;

public class Animal {

    private int age;

    private String vegetarian;

    private int numberOfLegs;

    private String color;

    public Animal(int age, String vegetarian, int numberOfLegs) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }

    public Animal() {

    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(String vegetarian){
        this.vegetarian = vegetarian;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void eat (){
        System.out.println("Animal is eating");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println(" Dog is barking ");
    }

    @Override
    public String toString () {
        return " regim alimentar: " + vegetarian + ";" + " varsta: " + this.getAge() + ";"
                + " numar picioare: " + this.getNumberOfLegs() + ";";
    }
}
