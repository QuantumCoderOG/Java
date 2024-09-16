package src.reflection;

class Bottle {
    private String material;
    private double capacity;

    public Bottle(String material, double capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public void displayDetails() {
        System.out.println("Material: " + material + ", Capacity: " + capacity + " liters");
    }
}