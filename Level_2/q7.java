package Level_2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Oper. 1 " + (a+b * c));
        System.out.println("Oper. 2 " + (a*b + c));
        System.out.println("Oper. 3 "+ (c + a/b));
        System.out.println("Oper. 4 " + (a%b - c));
        sc.close();
    }
}
