package Day_01;

import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();
        double heightFeet = heightCm / 30.48;
        double heightInches = heightCm / 2.54;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);
    }
}