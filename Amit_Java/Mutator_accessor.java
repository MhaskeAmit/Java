class MyDate{
	
	int dd, mm, yy;
	
	public int getDay(){
	
		System.out.println(dd);
		return dd;
	}
	public int getMonth(){
	
		System.out.println(mm);
		return mm;
	}
	public int getYear(){
	
		System.out.println(yy);
		return yy;
	}
	
	public void setDay(int d){
	
		this.dd = d;
	}
	public void setMonth(int m){
	
		this.mm = m;
	}
	public void setYear(int y){
	
		this.yy = y;
	}
	
	public static void main(String args[])
	{
		MyDate d = new MyDate();
		
		d.setDay(1);
		d.setMonth(2);
		d.setYear(1995);
		
		d.getDay();
		d.getMonth();
		d.getYear();
		
		
	}
}
