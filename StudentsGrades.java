package Practice1;

import java.util.Scanner;

public class StudentsGrades {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int grade = in.nextInt();
		
		if(grade <= 100 && grade >= 95) {
			System.out.println("A");
		}
		else if(grade <= 94 && grade >= 90) {
			System.out.println("A-");
		}
		else if(grade <= 89 && grade >= 85) {
			System.out.println("B+");
		}
		else if(grade <= 84 && grade >= 80) {
			System.out.println("B");
		}
		else if(grade <= 79 && grade >= 75) {
			System.out.println("B-");
		}
		else if(grade <= 74 && grade >= 70) {
			System.out.println("C+");
		}
		else if(grade <= 69 && grade >= 65) {
			System.out.println("C");
		}
		else if(grade <= 64 && grade >= 60) {
			System.out.println("C-");
		}
		else if(grade <= 59 && grade >= 55) {
			System.out.println("D+");
		}
		else if(grade <= 54 && grade >= 50) {
			System.out.println("D");
		}
		else if(grade <= 49 && grade >= 45) {
			System.out.println("D-");
		}
		
		else System.out.println("Not Satisfying!");
		in.close();

	}
		
}
