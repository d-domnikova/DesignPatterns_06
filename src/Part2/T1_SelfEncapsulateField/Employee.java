package Part2.T1_SelfEncapsulateField;

public class Employee {
    private String name;
    private double salary;
    // Конструктор та інші методи класу...
    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }
    public double getSalary() {
        return salary;
    }
    // Інші методи класу...
}
