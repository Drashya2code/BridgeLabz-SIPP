import java.util.*;

public class q6{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		double si = (int) (p * r * t) / 100;
		System.out.println(si);
	}
}