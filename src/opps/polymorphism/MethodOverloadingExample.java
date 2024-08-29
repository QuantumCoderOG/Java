package src.opps.polymorphism;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of integers: " + calc.add(5, 10)); // Calls int version
        System.out.println("Sum of doubles: " + calc.add(5.5, 10.5)); // Calls double version
    }

//    Explanation:
//    The Calculator class has two add() methods with different parameter types.
//    The correct method is chosen at compile-time based on the argument types.
//
}
