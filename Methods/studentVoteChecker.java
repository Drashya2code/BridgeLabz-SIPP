package Methods;

import java.util.Scanner;

public class studentVoteChecker {
    public static boolean canVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of 10 students:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = sc.nextInt();
            
            if (canVote(age)) {
                System.out.println("Student " + i + " can vote");
            } else {
                System.out.println("Student " + i + " cannot vote");
            }
        }
        sc.close();
    }
}
