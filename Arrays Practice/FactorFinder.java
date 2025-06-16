import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (count == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    System.arraycopy(factors, 0, temp, 0, count);
                    factors = temp;
                }
                factors[count++] = i;
            }
        }

        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
