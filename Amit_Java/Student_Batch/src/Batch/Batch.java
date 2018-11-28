package Batch;
//import Student.Student;
public class Batch {
	
	private static int BatchNo;
	
	public Batch(int b) {
		this.BatchNo = b;
	}

	public static void Display() {
		System.out.println("Batch number is:"+BatchNo);
	}
}
