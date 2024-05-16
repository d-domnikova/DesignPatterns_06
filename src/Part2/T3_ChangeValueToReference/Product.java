package Part2.T3_ChangeValueToReference;

public class Product {
    private String name;
    private double price;
    private Currency currency;

    public Product(String name, double price, Currency currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Currency getCurrency() {
        return currency;
    }
    // Інші методи класу...
}
