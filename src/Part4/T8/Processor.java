package Part4.T8;

public class Processor {
    private Calculator calculator;
    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }
    public int process(int x, int y) {
        return this.calculator.add(x, y);
    }
}
