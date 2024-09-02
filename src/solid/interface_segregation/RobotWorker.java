package src.solid.interface_segregation;

public class RobotWorker {

    public void work() {
        System.out.println("Robot is working");
    }

    public void eat() {
        // Robots don't eat, so this method is not needed
    }
//    Definition: Clients should not be forced to depend on interfaces
//    they do not use. Instead of one fat interface, many small, specific interfaces are preferable.
}

