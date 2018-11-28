import java.util.Scanner;

class DecimalToBinary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number:");
		num = sc.nextInt();
		
		int digit[] = new int[10];
		int binary;
		while(num>0)
		{
			
			digit = num%2;
			num/=2;
			
		String str = String.valueOf(digit);
		
		String rev = "";
		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.print(rev);
		}

		
		
		
		
		
	}
}

