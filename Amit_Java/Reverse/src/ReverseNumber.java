import java.util.Scanner;
public class ReverseNumber {
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		
		int num[] = new int[size];
		
		System.out.println("Enter the values");
		
		for(int i = 0;i<size;i++)
		{
			num[i] = sc.nextInt();
			System.out.print(num[i]);
			
		}
		System.out.println("");
		
		for(int j = num.length-1; j>=0; j--)
		{
			System.out.print(num[j]);
		}
		
		
		
		
	}

}
