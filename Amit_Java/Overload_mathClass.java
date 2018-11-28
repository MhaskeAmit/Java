class MathClass{

	int a;
	float b;
	String cal;
	
	public MathClass(){
	
		this.a = 0;
		this.b = 0;
		this.cal = "";
	}
	
	public void add(int a, float b, String cal)
	{
		
		
		System.out.println(a+b+cal);
		
	}
	public void add(float b, String cal, int a)
	{
	
		System.out.println(a+b+cal);
		
	}

	public static void main(String args[]){
	
		MathClass m = new MathClass();
		m.add(1,2,"Amit");
		m.add(2,"XYZ",10);
	
	}
}
