package Methods;

public class operationOnRandomValues {
    public static void main(String[] args) {
        double[] numbers = new double[5];
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            numbers[i] = 1000 + (Math.random() * 9000);
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = sum / 5;

        System.out.println("The random numbers are:");
        for (double num : numbers) {
            System.out.printf("%.2f\n", num);
        }
        System.out.printf("\nAverage: %.2f\n", average);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Maximum: %.2f\n", max);
    }
}
