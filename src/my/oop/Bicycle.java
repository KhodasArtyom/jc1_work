package my.oop;

public class Bicycle extends Machine implements Movable, Stoppable{

    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }
    public void stop() {
        System.out.println("Bicycle stopped");
    }

    @Override
    public void work() {
        System.out.println("Car is working");
    }
}
