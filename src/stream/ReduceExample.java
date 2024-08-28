package src.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000)
        );

        // Sum all employee salaries
        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("Total Salary: " + totalSalary);
    }

//    OUTPUT
//    Total Salary: 300000.0
//
//    The map(Employee::getSalary) converts the stream of Employee objects to a stream of their salaries.
//    The reduce(0.0, Double::sum) operation then sums up all the salaries, producing the total.

}