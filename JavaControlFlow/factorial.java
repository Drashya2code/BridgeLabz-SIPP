package JavaControlFlow;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long result = 0;
        while (number > 0) {
            result *= number;
            number--;
        }
        System.out.println(result);
        sc.close();
    }    
}
