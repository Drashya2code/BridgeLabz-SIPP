package practiceProblem_01;
import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city (From City): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city (To City): ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        double timeFromToVia = scanner.nextDouble();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
        double timeViaToFinalCity = scanner.nextDouble();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.6;

        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes\n",
                name, fromCity, toCity, viaCity, totalDistanceKm, totalTime);

        scanner.close();
    }
}
