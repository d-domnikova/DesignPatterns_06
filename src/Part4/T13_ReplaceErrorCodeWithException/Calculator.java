package Part4.T13_ReplaceErrorCodeWithException;

public class Calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Помилка: Ділення на нуль");
        }
        return dividend / divisor;
    }
    public static void main(String[] args) {
        try{
            int result = divide(10, 0);
            System.out.println("Результат ділення: " + result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}