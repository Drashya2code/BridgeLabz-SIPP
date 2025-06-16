package JavaControlFlow;

import java.util.Scanner;

public class greatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxFactor = 1;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                maxFactor = i;
            }
        }

        System.out.println("Greatest factor of " + num + " beside itself is: " + maxFactor);
        sc.close();
    }
}
