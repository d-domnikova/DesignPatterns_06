package Part1.T4_InlineClass;

public class Person {
    private String name;
    private Address address;
    // Конструктор, геттери та сеттери...
    public void printAddress() {
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity
                () + ", " + address.getCountry());
    }
}
