import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {
	
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public static void main(String args[])
	{
		Set s = new HashSet();
		s.add(new Employee(1, "Amit"));
		s.add(new Employee(1,"Omkar"));
		
		
			
	}
}
