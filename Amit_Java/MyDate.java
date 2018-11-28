class MyDate{
	
	int dd, mm, yy;
	
	public MyDate(){
	
		this.dd = 0;
		this.mm = 0;
		this.yy = 0;
	
	}
	
	public MyDate(int d, int m, int y){
	
		this.dd = d;
		this.mm = m;
		this.yy = y;
	}
	
	void initDate(){
	
		System.out.println("Date:"+this.dd+"/"+this.mm+"/"+this.yy);
	}
	public static void main(String args[]){
	
		MyDate e = new MyDate();
		MyDate d = new MyDate(1,2,1995);
		e.initDate();
		d.initDate();
	}
}
