package src.abstractclass;

abstract class Animal  {
    public abstract void sound();

    // Concrete method (has a body)
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
