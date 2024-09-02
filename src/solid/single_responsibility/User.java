package src.solid.single_responsibility;

// Violating SRP
class User {
    public void login(String username, String password) {
        // logic for user login
    }

    public void saveUserData() {
        // logic to save user data
    }

    public void sendEmail(String message) {
        // logic to send an email
    }

//    Definition: A class should have only one reason to change,
//            meaning it should have only one responsibility or job.
}