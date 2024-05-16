package Part3.T7_IntroduceNullObject;

public class NullAddress extends Address{
    public NullAddress() {
        super("n/a", "n/a");
    }

    @Override
    public String getStreet() {
        return "n/a";
    }

    @Override
    public String getCity() {
        return "n/a";
    }
}
