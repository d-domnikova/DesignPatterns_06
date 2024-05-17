package Part5.T9_CollapseHierarchy;

public class Animal {
    private String species;
    public Animal(String species) {
        this.species = species;
    }
    public void eat() {
        System.out.printf("The %s is eating.%n", this.species);
    }
    public void sleep() {
        System.out.printf("The %s is sleeping.%n", this.species);
    }
    public void makeSound() {
        System.out.printf("The %s is barking.%n", this.species);
    }
}