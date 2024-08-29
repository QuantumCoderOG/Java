package src.DesignPatter.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle clonedCircle = (Circle) circle.clone();

        System.out.println("Original: " + circle.type);
        System.out.println("Cloned: " + clonedCircle.type);
    }
}