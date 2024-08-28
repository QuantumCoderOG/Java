package src.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MapFunctionExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000)
        );

        // Map Employee objects to their names
        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Employee Names: " + employeeNames);
    }

//    OUTPUT
//    Employee Names: [John Doe, Jane Smith, Jack Johnson, Tom Hanks]

//    The map() function is used to extract the names of the employees from the list of Employee objects.
//    The map(Employee::getName) operation returns a stream of names, which is then collected into a List.
}
