import Student.Student;
import Batch.Batch;
public class Test {

	public static void main(String args[]) {
		
		Student s = new Student(1,"Amit");
		Batch b = new Batch(101);
		
		s.Display();
		b.Display();
	}
	
}
