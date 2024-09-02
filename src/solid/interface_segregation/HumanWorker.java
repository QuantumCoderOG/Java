package src.solid.interface_segregation;

public class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human is working");
    }

    public void eat() {
        System.out.println("Human is eating");
    }
}
