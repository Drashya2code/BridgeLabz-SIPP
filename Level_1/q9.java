package Level_1;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discount = sc.nextInt();
        System.out.println(fee - (fee*(discount/100)));
        sc.close();
    }
}
