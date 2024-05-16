package Part3.T3;

public class Order {
    public void processOrder(int quantity, double price) {
        if (quantity > 10 || price > 100) {
            applyDiscount();
        }
        // Операція 1
        // Операція 2
    }

    public void applyDiscount(){}
}
