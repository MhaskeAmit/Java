class Employee implements Cloneable
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{	
		this.id = id;
		this.name  = name;
	}
	
	public void Display()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
	
	public Object clone()
	{
		Employee temp = new Employee(this.id,this.name);
		return temp;
	}

	public static void main(String args[])
	{
		Employee e = new Employee(1,"Amit");
		
		Employee e1 = (Employee)e.clone();
		
		e.Display();
		e1.Display();
	}
}

