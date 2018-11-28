class Date{

	int dd,mm,yy;
	
	public Date(int d , int m, int y){
		this.dd = d;
		this.mm = m;
		this.yy = y;
	}
	
	public static void swap(Date d1, Date d2)
	{
		Date temp;
		temp = d1;
		d1 = d2;
		d2 = temp;
		
	}
	public static void Display(Date d1, Date d2)
	{
		System.out.println("Date d1 is:"+d1);
		System.out.println("Date d2 is:"+d2);
	}
	public static void main(String args[])
	{
		Date d1 = new Date(1,2,1995);
		Date d2 = new Date(2,3,1998);
		
		Date.swap(d1,d2);
		Date.Display(d1,d2);
		
	}
}
