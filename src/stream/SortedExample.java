package src.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000)
        );

        // Sort employees by salary
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("Employees sorted by salary: " + sortedEmployees);
    }

//    Output
//    Employees sorted by salary: [Employee{name='John Doe', department='HR', salary=60000.0}, Employee{name='Jane Smith', department='Finance', salary=75000.0}, Employee{name='Jack Johnson', department='IT', salary=80000.0}, Employee{name='Tom Hanks', department='IT', salary=85000.0}]

//    The sorted(Comparator.comparing(Employee::getSalary)) operation sorts the employees by their salary in ascending order.
//    The sorted list of employees is then collected and printed.
}







