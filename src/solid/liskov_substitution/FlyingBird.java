package src.solid.liskov_substitution;

class FlyingBird implements LiskovBird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat() {
        System.out.println("Bird is eating");
    }
}
