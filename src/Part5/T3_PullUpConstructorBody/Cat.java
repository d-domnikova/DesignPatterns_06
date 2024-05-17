package Part5.T3_PullUpConstructorBody;

public class Cat extends Animal {
    String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
}