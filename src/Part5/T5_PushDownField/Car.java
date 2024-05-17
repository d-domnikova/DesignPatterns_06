package Part5.T5_PushDownField;

public class Car extends Vehicle {
   protected String brand;

   public Car(String model, String brand) {
      super(model);
      this.brand = brand;
   }
}