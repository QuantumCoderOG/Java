package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000),
                new Employee("John Doe", "HR", 60000) // Duplicate
        );

        // Remove duplicate employees
        List<Employee> distinctEmployees = employees.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct Employees: " + distinctEmployees);
    }

//    OUTPUT
//    Distinct Employees: [Employee{name='John Doe', department='HR', salary=60000.0}, Employee{name='Jane Smith', department='Finance', salary=75000.0}, Employee{name='Jack Johnson', department='IT', salary=80000.0}, Employee{name='Tom Hanks', department='IT', salary=85000.0}]


//    The distinct() function removes duplicate Employee objects from the list.
//    Duplicates are determined based on the equals() and hashCode() methods of the Employee class.
}