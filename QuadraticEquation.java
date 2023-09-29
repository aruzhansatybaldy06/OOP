package Practice1;
import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double x1, x2;
		
		int d = b * b - 4 * a * c;
		if(d > 0) {
			x1 = (-b + Math.sqrt(d))/(2 * a);
			x2 = (-b - Math.sqrt(d))/(2 * a);
			System.out.println("x1 = " + x1 + ", " + "x2 = " + x2);
		}else if(d == 0) {
			x1 = -b/(2 * a);
			System.out.println("x = " + x1);
		}else System.out.println("There is no root!");
		
		in.close();
	}
}
