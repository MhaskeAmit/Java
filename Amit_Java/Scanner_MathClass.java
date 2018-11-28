import java.util.Scanner;
class MathClass{


	
	
	
	
	
	public void accept_add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers you want to add:");
		int size = sc.nextInt();
		System.out.println("Enter the integers:");
		int result = 0;
		for(int i =0 ;i<size;i++)
		{
			
			int no_of_integers = sc.nextInt();
			result += no_of_integers;
		}
		System.out.println("Result:"+result);
	
	}
	
	public static void main(String args[]){
	
	MathClass m = new MathClass();
	m.accept_add();
	
	
	}
}
