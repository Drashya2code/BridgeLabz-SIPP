package Day_01;

import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / Math.pow(2.54, 2);
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}