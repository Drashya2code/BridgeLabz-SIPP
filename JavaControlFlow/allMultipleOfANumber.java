package JavaControlFlow;

import java.util.*;
public class allMultipleOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Multiples of " + num + " below 100 are:");
        for (int i = num; i < 100; i += num) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
