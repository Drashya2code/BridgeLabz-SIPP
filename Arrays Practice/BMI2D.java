import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3];  // weight, height, bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double weight, height;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            } while (weight <= 0);
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
            } while (height <= 0);

            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = weight / (height * height);

            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 24.9) status[i] = "Normal";
            else if (bmi < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    i + 1, data[i][1], data[i][0], data[i][2], status[i]);
        }
    }
}
