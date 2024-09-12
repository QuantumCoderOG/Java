package src.innerclass;

public class OuterClass2 {
    private String outerField = "Outer Class Field";

    public void outerMethod() {
        // Local inner class inside a method
        class LocalInnerClass {
            public void display() {
                System.out.println("Accessing outer class field from local inner class: " + outerField);
            }
        }

        // Creating an instance of the local inner class inside the method
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.outerMethod();
    }
}