class Date{
	int dd, mm, yy;
	
	public Date(int d, int m , int y)
	{
		this.dd = d;
		this.mm = m;
		this.yy = y;
	}
	
	public String toString()
	{
		return this.dd+"/"+this.mm+"/"+this.yy;
	}

	public static void main(String args[])
	{
		Date d1 = new Date(1,8,2018);
		Date d2 = new Date(1,8,2018);
		
		if((d1.toString()).equals(d2.toString()))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		
		System.out.println("Hash code of d1:"+d1.hashCode());
	}
}
