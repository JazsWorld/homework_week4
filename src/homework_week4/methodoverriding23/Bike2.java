package homework_week4.methodoverriding23;

/**
 * Example of method overriding
 */

public class Bike2 extends Vehicle{
    public void run()
    {

        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
