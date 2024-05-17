package Part5.T5_PushDownField;

public class Truck extends Vehicle {
    public Truck(String model) {
        super(model);
    }
    // Клас Truck використовує лише поле model, а поле brand не використовується
}