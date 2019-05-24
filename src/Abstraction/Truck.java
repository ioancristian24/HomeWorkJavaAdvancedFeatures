package Abstraction;

public class Truck extends Vehicle {

    public Truck (int gear, int speed){
        super( gear, speed );
    }

    public Truck() {
        super();
    }

    @Override
    public void printState (){
        System.out.println(" Truck state: is increasing speed. ");
    }
}
