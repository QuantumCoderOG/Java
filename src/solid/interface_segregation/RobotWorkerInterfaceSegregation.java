package src.solid.interface_segregation;

public class RobotWorkerInterfaceSegregation implements Workable {
    public void work() {
        System.out.println("Robot is working");
    }

//    Explanation: The first implementation violates ISP by forcing RobotWorker to implement the eat() method,
//    which it doesn't need. The second implementation follows ISP by splitting the interfaces,
//    so RobotWorker only implements what it actually needs.

}
