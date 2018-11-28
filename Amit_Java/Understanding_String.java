import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		String operation, ch;
		int x=10,y=40,z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the operation you want to enter:");
		operation = sc.nextLine();
		switch(operation)
		{
			case "Add":
					z = x + y;
					System.out.println("Ans:"+z);
				break;
			case "Multiply":
					z = x * y;
					System.out.println("Ans:"+z);
				break;
				
			case "Substract":
					z = x -y;
					System.out.println("Ans:"+z);
				break;
				
			default:
				System.out.println("Wrong Choice");
		}		
	}
}
