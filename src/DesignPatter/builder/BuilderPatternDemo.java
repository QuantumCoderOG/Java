package src.DesignPatter.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .build();
        System.out.println("User created: " + user);
    }
}