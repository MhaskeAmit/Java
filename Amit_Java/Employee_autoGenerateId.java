import java.util.Scanner;

class Employee{

	
	public Employee(){

	
	}
	
	public static void accept()
	{
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		int size;
		int id;
		String name;
		int b_sal;
		System.out.println("Enter the number of employees you want to enter:");
		size = sc.nextInt();
		System.out.println("Enter the name and salary:");		
		for(int i = 1;i<=size;i++){
			id = counter;
			System.out.println("ID:"+id);
			name = sc.next();
			System.out.println("Name:"+name);
			b_sal = sc.nextInt();
			System.out.println("Basic Salary:"+b_sal);
			counter+=1;
			
			for(int j= 1;j<=size;j++)
			{
				System.out.println("ID is:"+id);
				System.out.println("Name is:"+name);
				System.out.println("Salary is:"+b_sal);
			}
		

		}
		
	}
	
	
	
	
	public static void main(String args[])
	{
		Employee e = new Employee();
		Employee.accept();
		
	}
}
