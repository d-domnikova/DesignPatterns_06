package Part1.T1_MoveMethod;

public class Account {
    private double balance;
    private double interestRate;
    // Конструктор та інші методи класу...
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest calculated: " + interest);
        // Логіка для обчислення відсотків...
    }
}