package entities;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }
}
