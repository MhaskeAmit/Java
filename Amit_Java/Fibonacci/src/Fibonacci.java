import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
		int t1 = 0, t2 =1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=0;i<=n;i++)
		{
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		
		System.out.println(sum);
		
	}
}
