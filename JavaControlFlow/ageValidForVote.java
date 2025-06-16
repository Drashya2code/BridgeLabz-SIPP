package JavaControlFlow;

import java.util.Scanner;

public class ageValidForVote {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >- 18){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
