package Part4.T4_SeparateQueryFromModifier;

public class Account {
    private double balance;

    public void subtractCommission(){
        double commission = 0.05;
        balance -= balance * commission;
    }
    public double getBalance() {
        return balance;
    }
}