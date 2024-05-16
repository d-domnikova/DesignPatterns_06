package Part2.T14;

public abstract class OrderStatus {
    public static final int NEW = 0;
    public static final int PROCESSING = 1;
    public static final int COMPLETED = 2;
    public static final int CANCELLED = 3;

    public abstract int getStatus();

    public static OrderStatus Create(int type) throws Exception {
        switch (type){
            case NEW -> {
                return new OrderNew();
            }
            case PROCESSING -> {
                return new OrderProcessing();
            }
            case COMPLETED -> {
                return new OrderCompleted();
            }
            case CANCELLED -> {
                return new OrderCanceled();
            }
        }
        throw new Exception("Unknown type");
    }
}
