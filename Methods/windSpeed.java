package Methods;

import java.util.Scanner;

public class windSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        int windSpeed = sc.nextInt();
        findWindChill(temperature, windSpeed);
        sc.close();
    }
    public static double findWindChill(int temperature, int windSpeed){
        double windChill = 35.74 + 0.6215*temperature + (0.4273*temperature - 35.75) * (Math.pow(windSpeed,0.16));

        return windChill;
    }
}
