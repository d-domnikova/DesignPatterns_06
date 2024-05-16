package Part2.T14;

public class OrderCompleted extends OrderStatus{
    @Override
    public int getStatus() {
        return COMPLETED;
    }
}
