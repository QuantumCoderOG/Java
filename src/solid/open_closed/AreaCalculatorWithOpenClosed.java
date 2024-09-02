package src.solid.open_closed;

public class AreaCalculatorWithOpenClosed {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }


//    Definition: Software entities (classes, modules, functions, etc.) should be open for extension
//    but closed for modification.

//    Explanation: The first implementation violates OCP because every time a new shape is introduced,
//    the AreaCalculator class needs to be modified. The second implementation follows OCP,
//    where new shapes can be added without modifying the existing AreaCalculator class.
}
