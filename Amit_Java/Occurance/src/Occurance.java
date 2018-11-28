
public class Occurance {
	
	public static void occur(String s, char c)
	{
		int count =0;
		for(int i =0 ; i<s.length()-1;i++)
		{
			if(s.charAt(i) == c)
			{
				count++;
			}
			
		}
		System.out.println(c+" count is:"+count);
		
	}
	public static void main(String args[])
	{
		Occurance c = new Occurance();
		Occurance.occur("Amitiiiiiiiiiii", 'i');
	}
}
