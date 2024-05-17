package Part5.T1_PullUpField;

public class Car extends Vehicle {
    // Додаткові поля для підкласу Car
    private String model;
    public Car(String color, String model) {
        super(color);
        this.model = model;
    }
}