package Methods;

import java.util.Scanner;

public class trigonometricFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degrees = sc.nextDouble();
        double radians = Math.toRadians(degrees);
        conversion(degrees,radians);
        sc.close();
    }
    
    public static void conversion(double degrees, double radians) {
        System.out.println("sin(" + degrees + ") = " + Math.sin(radians));
        System.out.println("cos(" + degrees + ") = " + Math.cos(radians));
        System.out.println("tan(" + degrees + ") = " + Math.tan(radians));
        System.out.println("sec(" + degrees + ") = " + (1.0 / Math.cos(radians)));
        System.out.println("cosec(" + degrees + ") = " + (1.0 / Math.sin(radians)));
        System.out.println("cot(" + degrees + ") = " + (1.0 / Math.tan(radians)));
    }
}
