import java.util.Scanner;

public class MarksProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                phy[i] = sc.nextInt();
            } while (phy[i] < 0);
            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                chem[i] = sc.nextInt();
            } while (chem[i] < 0);
            do {
                System.out.print("Enter Math marks for student " + (i + 1) + ": ");
                math[i] = sc.nextInt();
            } while (math[i] < 0);

            int total = phy[i] + chem[i] + math[i];
            percent[i] = total / 3.0;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 40) grade[i] = "D";
            else grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - %: " + percent[i] + ", Grade: " + grade[i]);
        }
    }
}
