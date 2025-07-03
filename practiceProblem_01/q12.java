package practiceProblem_01;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d\n",
                          quotient, remainder, number1, number2);

        scanner.close();
    }
}
