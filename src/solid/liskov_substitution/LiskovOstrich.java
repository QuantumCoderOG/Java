package src.solid.liskov_substitution;

public class LiskovOstrich implements LiskovBird{
    public void eat() {
        System.out.println("Ostrich is eating");
    }
//    Objects of a superclass should be replaceable
//    with objects of a subclass without affecting the correctness of the program.

//    Explanation: The first implementation violates LSP
//    because substituting a Bird object with an Ostrich object would break
//    the program (since Ostrich can’t fly).
//    The second implementation avoids this issue by not assuming that all birds can fly, adhering to LSP.
}
