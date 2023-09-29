package Practice1;

import java.util.Scanner;

public class MyBalance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int balance = in.nextInt();
		System.out.println("Your balance: " + balance);
		double newBalance = balance * 1.2;
		System.out.println("Your balance now: " + newBalance);
		
		in.close();
	}
}