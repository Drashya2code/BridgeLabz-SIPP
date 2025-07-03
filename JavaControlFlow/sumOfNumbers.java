package JavaControlFlow;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int number = sc.nextInt();
            sum += number;
            if(number == 0){
                break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
