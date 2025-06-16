package Level_2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feet = sc.nextInt();
        double yard = feet * 3;
        double miles = yard * 1760;
        System.out.println("Yard "+ yard);
        System.out.println("Miles" + miles);
        sc.close();
    }
}
