package src.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "HR", 60000),
                new Employee("Jane Smith", "Finance", 75000),
                new Employee("Jack Johnson", "IT", 80000),
                new Employee("Tom Hanks", "IT", 85000)
        );

        // Each employee has a list of projects
        List<List<String>> projects = Arrays.asList(
                Arrays.asList("Project A", "Project B"),
                Arrays.asList("Project C"),
                Arrays.asList("Project D", "Project E"),
                Arrays.asList("Project F", "Project G", "Project H")
        );

        // Flatten the project list using flatMap
        List<String> allProjects = projects.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("All Projects: " + allProjects);
    }

//    Output
//    All Projects: [Project A, Project B, Project C, Project D, Project E, Project F, Project G, Project H]

//    The flatMap() function is used to flatten a stream of project lists into a single stream of project names.
//    This results in a list of all projects without the nested structure.
}
