import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int n : nums) {
            if (n > 0) {
                System.out.print(n + " is positive and ");
                System.out.println(n % 2 == 0 ? "even." : "odd.");
            } else if (n < 0) {
                System.out.println(n + " is negative.");
            } else {
                System.out.println(n + " is zero.");
            }
        }

        if (nums[0] == nums[4]) {
            System.out.println("First and last numbers are equal.");
        } else if (nums[0] > nums[4]) {
            System.out.println("First number is greater than last.");
        } else {
            System.out.println("First number is less than last.");
        }
    }
}
