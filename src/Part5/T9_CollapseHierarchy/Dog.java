package Part5.T9_CollapseHierarchy;

public class Dog extends Animal {
    public Dog(String species) {
        super(species);
    }
    public void bark() {
        System.out.println("The dog is barking.");
    }
}