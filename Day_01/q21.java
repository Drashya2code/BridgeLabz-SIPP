package Day_01;
import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time);
    }
}