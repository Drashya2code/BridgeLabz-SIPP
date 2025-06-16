import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int count = 0;

        while (num != 0 && count < 10) {
            digits[count++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
