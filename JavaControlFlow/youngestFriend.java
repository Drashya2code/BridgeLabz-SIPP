package JavaControlFlow;

import java.util.Scanner;

public class youngestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();

        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();

        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();

        String youngest = "Amar";
        int minAge = amarAge;
        if (akbarAge < minAge) {
            youngest = "Akbar";
            minAge = akbarAge;
        }
        if (anthonyAge < minAge) {
            youngest = "Anthony";
        }

        String tallest = "Amar";
        double maxHeight = amarHeight;
        if (akbarHeight > maxHeight) {
            tallest = "Akbar";
            maxHeight = akbarHeight;
        }
        if (anthonyHeight > maxHeight) {
            tallest = "Anthony";
        }

        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);
        sc.close();
    }
}
