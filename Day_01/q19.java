package Day_01;

import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double distance = 5000;
        double rounds = distance / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
