package Part5.T11_ReplaceInheritanceWithDelegation;

public class Person {
    private final Animal animal;
    public Person(Animal animal) {
        this.animal = animal;
    }
    void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }
}
