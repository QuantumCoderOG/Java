package src.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectExample {

    public static void main(String[] args) {
        List<Employee> people = Arrays.asList(
                new Employee("Alice", "IT",9),
                new Employee("Bob", "SALES",25),
                new Employee("Charlie","MANAGEMENT", 20)
        );

        List<Double>salaryList = people.stream().map(Employee::getSalary).collect(Collectors.toList());
        System.out.println(salaryList);
        Double sum = salaryList.stream().mapToDouble(x->x).sum();
        System.out.println(sum);

        List<Employee>sort= people.stream().sorted(Comparator.comparing(Employee::getDepartment).reversed().thenComparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sort);
    }
}
