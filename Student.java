package practice2;

public class Student {
	private int id;
	String name;
	public static int yearOfStudy = 0;
	public static int getYear() {
		return ++ yearOfStudy ;
	} 
	public Student() {
		
	}
	public Student(int id) {
		this();
		this.id = id;
	}
	public Student(int id, String name) {
		this(id);
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
