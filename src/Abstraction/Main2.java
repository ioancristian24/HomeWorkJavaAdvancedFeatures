package Abstraction;

public class Main2 {

    public static void main(String[] args) {

        Truck truck = new Truck(1,1);

        truck.changeGear(2);

        truck.speedUp(3);

        truck.applyBrakes(1);

        truck.printState();

        Bus bus = new Bus(2,1);

        bus.changeGear(1);

        bus.speedUp(4);

        bus.applyBrakes(3);

        bus.printState();
    }
}
