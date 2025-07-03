package Methods;

import java.util.Scanner;

public class numberIsPostiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        checkNumber(number);
        sc.close();
        }

        public static void checkNumber(int num) {
            if (num > 0) {
                System.out.println(num + " is positive");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("The number is zero");
            }
    }
}
