package Methods;

import java.util.Scanner;

public class noOfRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangular park in meters:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds needed: " + rounds);
        sc.close();
        }

        private static int calculateRounds(double side1, double side2, double side3) {
            double perimeter = side1 + side2 + side3;
            double rounds = (5000 / perimeter);
            return (int) Math.ceil(rounds);
    }
}
