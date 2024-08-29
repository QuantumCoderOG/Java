package src.opps.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Modify the salary
        emp.setSalary(60000);
        System.out.println("Updated Employee Salary: " + emp.getSalary());
    }
//    Encapsulation is the mechanism of wrapping the data (variables) and code (methods)
//    together as a single unit.
//    In encapsulation, the variables of a class are
//     hidden from other classes and can only be accessed
//       through the methods of their current class.



//    Explanation:
//    The Employee class encapsulates the fields name and salary by making them private.
//    These fields can only be accessed or modified through the public methods (getters and setters).
//    This protects the data from being directly accessed or modified from outside the class.
}