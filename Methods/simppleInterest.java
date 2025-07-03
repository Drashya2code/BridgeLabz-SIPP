package Methods;

import java.util.Scanner;

public class simppleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        System.out.println((double) ((p*r*t)/100));
        sc.close();
    }
}
