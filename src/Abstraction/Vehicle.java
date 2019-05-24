package Abstraction;

public abstract class Vehicle {

    private int speed;

    private int gear;

    public Vehicle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public Vehicle() {

    }

    public void changeGear(int newGear){
        this.gear = newGear;
    }

    public void speedUp (int increment){
        this.speed = speed + increment;
    }

    public void applyBrakes (int decrement){
        this.speed= speed - decrement;
    }



    public abstract void printState ();
}
