import java.util.Scanner;

public class DynamicDigitStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxSize = 10;
        int[] digits = new int[maxSize];
        int count = 0;

        while (num != 0) {
            if (count == maxSize) {
                maxSize *= 2;
                int[] temp = new int[maxSize];
                System.arraycopy(digits, 0, temp, 0, count);
                digits = temp;
            }
            digits[count++] = num % 10;
            num /= 10;
        }

        int largest = -1, second = -1;
        for (int i = 0; i < count; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second);
    }
}
