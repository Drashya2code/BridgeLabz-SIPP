package JavaControlFlow;

import java.util.Scanner;

public class springSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if((month >= 3) && (month <6)){
            if(month == 3){
                if(day>=20){
                    System.out.println("Its a Spring Season");
                }else{
                    System.out.println("INot a Spring Season");
                }
            }

            if(month == 6){
                if(day>=20){
                    System.out.println("Its a Spring Season");
                }else{
                    System.out.println("INot a Spring Season");
                }
            }
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
}
