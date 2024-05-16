package Part2.T5_ReplaceArrayWithObject;

import java.util.ArrayList;
import java.util.List;

public class CarData {
private List<Car> cars;
    public CarData() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    // Додаткові методи для роботи з List...
}
