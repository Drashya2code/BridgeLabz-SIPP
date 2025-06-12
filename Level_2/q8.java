package Level_2;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Oper. 1 " + (a+b * c));
        System.out.println("Oper. 2 " + (a*b + c));
        System.out.println("Oper. 3 "+ (c + a/b));
        System.out.println("Oper. 4 " + (a%b - c));
        sc.close();
    }
}
