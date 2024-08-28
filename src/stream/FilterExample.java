package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000)
        );

        // Filter employees by IT department
        List<Employee> itEmployees = employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .collect(Collectors.toList());

        System.out.println("IT Employees: " + itEmployees);
    }

//    OUTPUT
//    IT Employees: [Employee{name='Jack Johnson', department='IT', salary=80000.0}, Employee{name='Tom Hanks', department='IT', salary=85000.0}]

//    The filter() function is used to select only those employees who work in the IT department.
//    The resulting list contains only the Employee objects from the IT department.
}