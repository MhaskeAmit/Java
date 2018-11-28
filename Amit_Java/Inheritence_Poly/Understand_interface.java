interface printable{

	void print();
}

class Employee implements printable
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
	}
	
	public static void main(String args[])
	{
		//printable prn;
		Employee e = new Employee(1,"Amit");
		e.print();
		/*prn = e;
		prn.print();
*/	}

}
