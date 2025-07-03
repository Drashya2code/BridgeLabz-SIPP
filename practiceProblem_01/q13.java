package practiceProblem_01;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();

        
        double areaSqCm = 0.5 * base * height;

        
        double areaSqIn = areaSqCm / 6.4516;

        
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaSqIn, areaSqCm);

        scanner.close();
    }
}
