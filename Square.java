package Practice1;
import java.util.Scanner;
import java.lang.Math;

class Square {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int area = a * a;
		int pm = 2 * a;
		int c = 2 * a * a;
		double dg = Math.sqrt(c);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + pm);
		System.out.println("Length of diagonal: " + dg);
		
		scan.close();
	}
}
