package Student;

public class Student {
	protected static int rollno;
	protected static String name;
	
	public Student(int r, String n) {
		this.rollno = r;
		this.name = n;
	}
	
	public static void Display() {
		System.out.println("Roll no.:"+rollno);
		System.out.println("Name :"+name);
	}
}
