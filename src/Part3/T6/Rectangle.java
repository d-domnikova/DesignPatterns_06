package Part3.T6;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    @Override
    public double calculateArea() {
        return this.getLength() * this.getWidth();
    }
}
