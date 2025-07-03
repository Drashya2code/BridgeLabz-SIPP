package Methods;

import java.util.Scanner;

public class divideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n,m);
        sc.close();
    }
    public static void print(int n, int m){
        System.out.println((int) n/m);
    }
}