package Part3.T7_IntroduceNullObject;

public class Customer {
    private Address address;
    public Customer(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        if(this.address == null){
            return new NullAddress();
        }
        return address;
    }
}
