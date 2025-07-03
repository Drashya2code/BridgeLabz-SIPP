package JavaControlFlow;

import java.util.Scanner;

public class chackNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 0){
            System.out.println("Number is Natural Number");
            long sum = (int) (number * (number + 1))/2;
            System.out.println(sum);
        }else{
            System.out.println("Not a Natural Number");
        }
        sc.close();
    }
}
