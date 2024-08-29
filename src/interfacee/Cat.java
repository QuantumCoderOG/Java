package src.interfacee;

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }

    // Use the default eat() method provided by the interface
}