package src.interfacee;

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    // Optionally override the default method
    @Override
    public void eat() {
        System.out.println("The dog eats bones.");
    }
}