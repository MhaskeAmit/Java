import java.util.Scanner;

public class Min_Max_avg_Total {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		size = sc.nextInt();
		
		int num[] = new int[size];
		
		System.out.println("Enter Values:");
		
		for(int i =0;i<size;i++)
		{
			num[i] = sc.nextInt();
		}
		
		
		for(int i =0; i<size; i++)
		{
			if(num[i] < num[i+1])
			{
				System.out.println("Min value found"+num[i]);
				break;
			}
			else
			{
				i++;
			}
		}
		
		
		int max = num[0];
		for(int i=0;i<size;i++)
		{
			if(max < num[i])
			{
				max = num[i];
			}
		}
		System.out.println("Max value:"+max);
		
		int total = 0;
		for(int i = 0; i<size;i++)
		{
			total += num[i];
		}
		System.out.println(total);
		
		int avg = 0;
		for(int i =0 ; i<size;i++)
		{
			avg = total/size;
		}
		System.out.println(avg);
	}

}
