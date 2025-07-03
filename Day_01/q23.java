package Day_01;

import java.util.Scanner;
public class q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        double handshakes = (students * (students - 1)) / 2.0;
        System.out.println("The maximum number of handshakes among " + students + " students is " + handshakes);
    }
}
