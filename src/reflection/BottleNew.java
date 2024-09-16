package src.reflection;

public class BottleNew {

    private String material;

    public BottleNew(String material) {
        this.material = material;
    }

    // Public method
    public String getMaterial() {
        return this.material;
    }

    // Private method
    private void printDetails() {
        System.out.println("Material: " + material);
    }
}
