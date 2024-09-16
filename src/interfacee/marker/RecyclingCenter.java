package src.interfacee.marker;

public class RecyclingCenter {

    // Check if an object is recyclable
    public static void recycle(Object object) {
        if (object instanceof Recyclable) {
            System.out.println("This object is recyclable.");
        } else {
            System.out.println("This object is not recyclable.");
        }
    }

    public static void main(String[] args) {
        Bottle plasticBottle = new Bottle("Plastic", 1.5);
        String paper = "A piece of paper";

        // Check if the objects are recyclable
        recycle(plasticBottle);  // Output: This object is recyclable.
        recycle(paper);          // Output: This object is not recyclable.
    }
}


//    Common Marker Interfaces in Java:
//        Serializable: Used to indicate that a class can be serialized, allowing its objects to be converted into a byte stream.
//        Cloneable: Marks that a class allows field-for-field copying of its objects via the clone() method.