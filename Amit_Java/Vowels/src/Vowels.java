import java.util.Scanner;

public class Vowels {
	public static void main(String args[])
	{
		int vowels[] = {'a','e','i','o','u'};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		String str = sc.nextLine();
		
		
		int count =0;
		
		for(int i =0;i<str.length()-1;i++)
		{
			if(vowels[i] == str.charAt(i))
			{
				System.out.println("Vowel found"+str.charAt(i));
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
