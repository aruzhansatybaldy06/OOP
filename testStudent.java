package practice2;

import java.util.Scanner;

public class testStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = in.nextLine();
		System.out.println("Enter your student ID: ");
		int id = in.nextInt();
		
		Student s1 = new Student(123, "Ayala");
		Student s2 = new Student(id, name);
		
		
		
		System.out.println("1st Student's name and id: " + s1.name + ", " + s1.getId());
		System.out.println("2nd Student's name and id: " + s2.name + ", " + s2.getId());
		
		System.out.println("Enter their year of study: ");
		
		
		int yearOfStudy = in.nextInt();
		
		int i = 0;
		while(i < yearOfStudy) {
			System.out.println("They are " + Student.getYear() + " year students"); 
			i++;
		}
		
		in.close();
	}

}
