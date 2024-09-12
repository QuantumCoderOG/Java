package src.innerclass;

public class OuterClass {
    private String outerField = "Outer Class Field";

    // Non-static inner class
    public class InnerClass {
        public void display() {
            System.out.println("Accessing outer class field: " + outerField);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outer = new OuterClass();

        // Creating an instance of the inner class using the outer class instance
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
