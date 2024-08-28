package src.stream;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000)
        );

        // Print each employee's name
        employees.stream()
                .forEach(e -> System.out.println(e.getName()));
    }

//    OUTPUT
//    John Doe
//    Jane Smith
//    Jack Johnson
//    Tom Hanks

//    The forEach() method is used to print the name of each employee in the list.
//    It takes a lambda expression that prints the name of each Employee object.
}