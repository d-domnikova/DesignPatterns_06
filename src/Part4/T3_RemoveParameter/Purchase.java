package Part4.T3_RemoveParameter;

public class Purchase {
    public double calculateTotal(double price, int quantity, double discount) {
        return price * quantity * (1 - discount);
    }

}
