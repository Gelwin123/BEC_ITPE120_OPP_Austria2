public class MathUtils {
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0; // To avoid division by zero
        }

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        
        return sum / numbers.length;
    }
    