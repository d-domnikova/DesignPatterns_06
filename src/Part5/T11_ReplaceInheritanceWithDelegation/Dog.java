package Part5.T11_ReplaceInheritanceWithDelegation;

public class Dog {
    private Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }
    void eat() {
        animal.eat();
    }
    void sleep() {
        animal.sleep();
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}