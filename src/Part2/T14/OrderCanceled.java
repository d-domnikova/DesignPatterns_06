package Part2.T14;

public class OrderCanceled extends OrderStatus{
    @Override
    public int getStatus() {
        return CANCELLED;
    }
}
