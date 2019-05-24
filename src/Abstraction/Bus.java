package Abstraction;

public class Bus extends Vehicle {

    public Bus (int speed, int gear){
        super( speed, gear );
    }

    public Bus() {
        super();
    }

    @Override
    public void printState(){
        System.out.println(" Bus State: is crossing the roundabout. ");
    }
}
