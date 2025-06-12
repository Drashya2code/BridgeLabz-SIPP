package Level_1;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        double inch = h * 2.54;
        double feet = inch * 12;
        System.out.println("Inches "+ inch);
        System.out.println("Feet" + feet);
        sc.close();
    }
}
