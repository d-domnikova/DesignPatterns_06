package Part4.T2_AddParameter;

public class Purchase {
    public double calculateTotal(double price, int quantity, double taxRate) {
        double total = price * quantity;
        double tax = total * (taxRate * 0.01);
        return total + tax;
    }
}