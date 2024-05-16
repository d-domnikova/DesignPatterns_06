package Part2.T15;

public class Shape {
    private int area;
    private int perimeter;

    public Shape(int area, int perimeter){
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return this.area;
    }
    public double getPerimeter() {
        return this.perimeter;
    }
}