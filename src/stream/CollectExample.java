package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000)
        );

        // Group employees by department
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Employees by Department: " + employeesByDept);
    }

//    OUTPUT
//    Employees by Department: {Finance=[Employee{name='Jane Smith', department='Finance', salary=75000.0}], HR=[Employee{name='John Doe', department='HR', salary=60000.0}], IT=[Employee{name='Jack Johnson', department='IT', salary=80000.0}, Employee{name='Tom Hanks', department='IT', salary=85000.0}]}

//    The collect(Collectors.groupingBy(Employee::getDepartment)) operation groups the employees by their department.
//    The result is a Map where the keys are department names, and the values are lists of employees in those departments.
}