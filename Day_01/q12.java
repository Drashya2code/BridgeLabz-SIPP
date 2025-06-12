package Day_01;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double totalPurchasePrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPurchasePrice + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
    }
}
