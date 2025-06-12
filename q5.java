import java.util.*;

public class q5{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		int h = sc.nextInt();
		double vol = 3.14 * rad * rad * h;
		System.out.println(vol);
	}
}