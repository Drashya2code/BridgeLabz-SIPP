import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                int m;
                do {
                    System.out.print("Subject " + (j + 1) + ": ");
                    m = sc.nextInt();
                    if (m < 0) System.out.println("Enter a positive mark.");
                } while (m < 0);
                marks[i][j] = m;
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = sum / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 40) grade[i] = "D";
            else grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                " - Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] +
                " | %: " + percentage[i] + " | Grade: " + grade[i]);
        }
    }
}
