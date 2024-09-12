package src.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    // Constructor to initialize fields
    public ImmutableClass(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Create a deep copy of the mutable list to maintain immutability
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for hobbies (returns a copy to ensure immutability)
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    // Main method to demonstrate how to use the immutable class
    public static void main(String[] args) {
        // Create a list of hobbies (mutable)
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Swimming");

        // Create an instance of ImmutableClass
        ImmutableClass person = new ImmutableClass("John Doe", 30, hobbies);

        // Access fields through getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Hobbies: " + person.getHobbies());

        // Try to modify the original list (it won't affect the immutable object)
        hobbies.add("Cycling");
        System.out.println("Modified Original Hobbies List: " + hobbies);
        System.out.println("ImmutableClass Hobbies: " + person.getHobbies()); // No change

        // Try to modify the list obtained from the getter (it won't affect the internal list)
        List<String> retrievedHobbies = person.getHobbies();
        retrievedHobbies.add("Gaming");
        System.out.println("Modified Retrieved Hobbies: " + retrievedHobbies);
        System.out.println("ImmutableClass Hobbies After Modification Attempt: " + person.getHobbies()); // Still no change
    }
}
