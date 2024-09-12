package src.innerclass;

public class OuterClass1 {
    private static String staticOuterField = "Static Outer Class Field";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Accessing outer class static field: " + staticOuterField);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class without the outer class instance
        OuterClass1.StaticNestedClass nested = new OuterClass1.StaticNestedClass();
        nested.display();
    }
}