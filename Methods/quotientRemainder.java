package Methods;

import java.util.Scanner;

public class quotientRemainder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        findQuotientRemainder(num1, num2);
        sc.close();
        }

        public static void findQuotientRemainder(int dividend, int divisor) {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
    }
}