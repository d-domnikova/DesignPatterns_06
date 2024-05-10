package Part1.T1_MoveMethod;

import java.util.List;

public class Bank {
    private List<Account> accounts;
    // Конструктор та інші методи класу...
    public void processAccounts() {
        for (Account account : accounts) {
            account.calculateInterest();
        }
    }
}