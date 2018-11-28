enum CoffeeSize
{
	BIG, HUGE, OVERWHELMING
}

public class Coffee
{
	CoffeeSize size;

	public static void main(String args[])
	{
		Coffee c = new Coffee();
		c.size = CoffeeSize.BIG;
		c.size = CoffeeSize.HUGE;
		System.out.println("Coffee:"+c.size);
	
	}
}
