class Account
{
	int acc_id;
	String acc_name;
	int balance;
	
	public Account(int id, String name, int bal)
	{
		this.acc_id = id;
		this.acc_name = name;
		this.balance = bal;
	}
	
	public class Locker{
	
		int Lock_id;
		
		public Locker(int id)
		{
			this.Lock_id = id;
		}
		
		public void Display()
		{
			System.out.println("Account id:"+acc_id);
			System.out.println("Name:"+acc_name);
			System.out.println("Balance:"+balance);
			System.out.println("Locker Id:"+Lock_id);
		}
		
		

	}
	public void print()
		{
			Locker l = new Locker(101);
			l.Display();
		}
	
	public static void main(String args[])
	{
		Account e = new Account(1,"Amit",10000);
		
		e.print();
		
	}


}
