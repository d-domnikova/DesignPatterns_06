package Part4.T14_ReplaceExceptionWithTest;

public class TemperatureConverter {
    public static Double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            return Double.NaN;
        }
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
            double celsius = convertToCelsius(-500); // Викидає виключення через недійсну температуру
        if(Double.isNaN(celsius)) {
            System.out.println("Температура в градусах Цельсія: " + celsius);
        } else {
            System.out.println("Помилка: неприпустима температура: менше абсолютного нуля");
        }
    }
}
