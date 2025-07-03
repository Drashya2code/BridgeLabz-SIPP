package Methods;

import java.util.Scanner;

public class smallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findSmallestLargest(a, b, c);
        sc.close();
        }

        public static void findSmallestLargest(int a, int b, int c) {
            int smallest = Math.min(Math.min(a, b), c);
            int largest = Math.max(Math.max(a, b), c);
            System.out.println("Smallest number is: " + smallest);
            System.out.println("Largest number is: " + largest);
    }
}
