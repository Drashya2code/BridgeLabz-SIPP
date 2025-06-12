package Level_1;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=b){
            System.out.println("Profit" + (a-b));
        }else{
            System.out.println("Loss" + (b-a));
        }
        sc.close();
    }
}
