import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number:");
		num = sc.nextInt();
		
		int digit;
		int binary;
		while(num/2!=0)
		{
			
			digit = num%2;
			//num/=2;
			//System.out.print(digit);
//			String str = Integer.toString(digit);
//		
//			String rev = "";
//			for(int i = str.length()-1;i>=0;i--)
//				{
//					rev = rev + str.charAt(i);
//					System.out.print(rev);
//				}
			
		System.out.println(digit);
		}
		

		
		
		
		
		
	}
}
