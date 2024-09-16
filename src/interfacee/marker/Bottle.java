package src.interfacee.marker;

// Bottle class implements the Recyclable marker interface
public class Bottle implements Recyclable {
    private String material;
    private double capacity;

    public Bottle(String material, double capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    // Getter methods
    public String getMaterial() {
        return material;
    }

    public double getCapacity() {
        return capacity;
    }
}
