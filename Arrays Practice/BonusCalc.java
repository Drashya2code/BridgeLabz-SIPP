import java.util.Scanner;

public class BonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            double sal, yrs;
            do {
                System.out.print("Salary: ");
                sal = sc.nextDouble();
            } while (sal <= 0);

            do {
                System.out.print("Years of service: ");
                yrs = sc.nextDouble();
            } while (yrs < 0);

            salary[i] = sal;
            service[i] = yrs;
        }

        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) bonus[i] = salary[i] * 0.05;
            else bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("\nBonus and Salary Summary:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Emp %d - Old: %.2f, Bonus: %.2f, New: %.2f%n",
                    i + 1, salary[i], bonus[i], newSalary[i]);
        }

        System.out.printf("Total Bonus: %.2f, Total Old Salary: %.2f, Total New Salary: %.2f%n",
                totalBonus, totalOld, totalNew);
    }
}
