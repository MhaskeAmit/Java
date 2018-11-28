abstract class Shape{

	public Shape()
	{
	
	}
	
	abstract void area();
	
}
class Circle extends Shape{
	public Circle()
	{
		super();
	}
	
	void area()
	{
		System.out.println("Hey i tried to access you .....");
	}
	
	public static void main(String args[])
	{
		Circle s = new Circle();
		s.area();
		
		Shape a = new Circle();// We can create an instance of abstract class ....but cannot access abstract method.
		a.area();
	}


	
}

