package src.solid.open_closed;

public class AreaCalculator {

    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.breadth;
        }
        return 0;
    }

    public class Circle  {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle  {
        double length, breadth;

        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public double calculateArea() {
            return length * breadth;
        }
    }

//    Explanation: The first implementation violates OCP because every time a new shape is introduced,
//    the AreaCalculator class needs to be modified. The second implementation follows OCP,
//    where new shapes can be added without modifying the existing AreaCalculator class.
}
