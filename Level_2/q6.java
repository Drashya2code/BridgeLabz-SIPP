package Level_2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Quotient" + (a/ b) + " Reminder "+ (a %b));
        sc.close();
    }
}
