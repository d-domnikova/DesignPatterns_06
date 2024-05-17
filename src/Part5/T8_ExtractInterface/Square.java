package Part5.T8_ExtractInterface;

public class Square implements IShape{
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}