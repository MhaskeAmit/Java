import java.util.Scanner;
class Employee{

	int e_id;
	String name;
	int b_sal;
	
	public Employee(){
		this.e_id = 0;
		this.name = "";
		this.b_sal = 0;
	}
	
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID , Name and Salary:");
		this.e_id = sc.nextInt();
		sc.nextLine();
		this.name = sc.nextLine();
		this.b_sal = sc.nextInt();
	}
	
	public void Display()
	{
		System.out.println("Info:"+e_id+"\n"+name+"\n"+b_sal);
	}
}
class Manager extends Employee{
	
	
	public Manager()
	{
		super();
				
	}
	
	public void PetrolAllowance(){
	
		int Petrol_allow = b_sal * (8/100);
		
		System.out.println("Petrol Allowance:"+Petrol_allow);
	
	}
	public void FoodAllowance(){
	
		int Food_allow = b_sal * (13/100);
		
		System.out.println("Food Allowance:"+Food_allow);
	
	}
	
	public void OtherAllowance(){
		int Other = b_sal * (3/100);
		System.out.println("Other Allowance:"+Other);
	}
}
class MarketingExecutive extends Employee{
	int km_travel;
	int Tour_allow;
	int Tele_allow = 1500;
	
	
	public MarketingExecutive()
	{
		super();
		this.km_travel = 0;
	}
	
	public void Km_travel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter km travelled:");
		km_travel = sc.nextInt();
	}
	public void Tour()
	{
		System.out.println("Tour Allowance per km is 5rs");
		System.out.println("Tour Allowance for client:");
		Tour_allow = km_travel * 5;
		
		System.out.println(Tour_allow);
	}
	
	
	public static void main(String args[])
	{
		Employee e = new Employee();
		
		e.accept();
		e.Display();
		
		Manager m = new Manager();
		m.PetrolAllowance();
		m.FoodAllowance();
		m.OtherAllowance();
		
		
		MarketingExecutive me= new MarketingExecutive();
		me.Km_travel();
		me.Tour();
	}
	
	
}
	

