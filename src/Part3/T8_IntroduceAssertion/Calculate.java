package Part3.T8_IntroduceAssertion;

public class Calculate {
    public double calculateAverage(int[] numbers) {
        if (numbers.length == 0){
            throw new Error("Array is empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
