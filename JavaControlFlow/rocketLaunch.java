package JavaControlFlow;

import java.util.Scanner;

public class rocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  countDown = sc.nextInt();
        for(int i = countDown;i>0;i--){
            System.out.println(i);
        }
        sc.close();;
    }
}
