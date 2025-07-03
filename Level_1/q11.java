package Level_1;
import java.util.*;

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition" + (a+b));
        System.out.println("Subtraction" + (a-b));
        System.out.println("Multiplication" + (a*b));
        System.out.println("Division "+ (a/b));
        sc.close();
    }
}