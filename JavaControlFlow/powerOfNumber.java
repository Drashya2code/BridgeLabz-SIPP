package JavaControlFlow;

import java.util.Scanner;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        double result = Math.pow(number,power);
        System.err.println(result);
        sc.close();
    }
}
