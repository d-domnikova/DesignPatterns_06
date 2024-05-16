package Part2.T13;

public abstract class Product {
    private String name;
    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getTypeCode();

    public abstract void process();

}