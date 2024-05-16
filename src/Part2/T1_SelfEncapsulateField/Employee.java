package Part2.T1_SelfEncapsulateField;

public class Employee {
    private String name;
    private double salary;
    // Конструктор та інші методи класу...
    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary()+amount);
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Інші методи класу...
}