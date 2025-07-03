import java.util.Scanner;

class FlightDetails{
    String[] boarding = {"Delhi", "Mumbai", "Agra", "Banglore","Kolkata"};

    String[] availableFlights = {"Arrived", "Available", "Departure", "Available","Arrived"};

    String [] departure = {"Kolkata", "Delhi","Banglore","Mumbai","Agra"};

    void FlightDetailsWithAvability(){
        for(int i = 0;i<boarding.length;i++){
            System.out.println("Flight from "+boarding[i] + " to " + departure[i] + " is " + availableFlights[i]);
        }
    }
    
    void book(int source, int destination) {
        if (availableFlights[source-1].equals("Available")) {
            System.out.println("Flight booked from " + boarding[source-1] + " to " + departure[destination-1]);
        } else {
            System.out.println("Sorry, no flights available from " + boarding[source-1]);
        }
    }

}
public class flightManagementProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightDetails flight = new FlightDetails();
        flight.FlightDetailsWithAvability();
        System.out.println("Book a flight ticket");
        System.out.println();
        System.out.println("Choose the nearest Airport Location");
        for(int i = 1;i<=flight.boarding.length;i++){
            System.out.println(i + " " + flight.boarding[i] );
        }
        int nearestAirport = sc.nextInt();
        System.out.println("Choose your Destination: ");
        System.out.println();
        for(int i = 1;i<=flight.departure.length;i++){
            System.out.println(i + " " + flight.departure[i] );
        }
        int destination = sc.nextInt();
        flight.book(nearestAirport, destination);
        sc.close();
    }
}
