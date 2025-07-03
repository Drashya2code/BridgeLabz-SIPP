package Day_01;

import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();
        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceFeet / 5280;
        System.out.println("The distance in yards is " + distanceYards + " while the distance in miles is " + distanceMiles);
    }
}