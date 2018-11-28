class Employee{

	
		private int e_id;
		private String e_name;
		private double b_sal, HRA, Medical, PF, Net_sal, Gross_sal;
		private double PT = 200;
		
		public Employee(int id,String name,double b_sal,double Med){
		
			this.e_id = id;
			this.e_name = name;
			this.b_sal = b_sal;
			
			this.Medical = Med;
			
			this.Net_sal = Net_sal;
			this.Gross_sal = Gross_sal;
		
		
		}
		
		public void calcHRA(){
			
			this.HRA = (b_sal * 50)/100;
			System.out.println("HRA:"+HRA);
		}
		public void calcPF(){
		
			this.PF = (b_sal * 12)/100;
			System.out.println("PF:"+PF);
		}
		
		public void EmpDetail(){
		
			System.out.println("ID:"+e_id+"\n"+"Employee name:"+e_name+"\n"+"Basic Salary:"+b_sal+"\n"+"Medical:"+Medical+"\n"+"Net Salary:"+Net_sal+"\n"+"Gross Salary+"+Gross_sal);
		}
		
		public void calcGross(){
		
			Gross_sal = b_sal + HRA + Medical;
			System.out.println("Gross salary:"+Gross_sal);
		}
		
		public void calcNet_sal(){
		
			Net_sal = Gross_sal - (PT + PF);
			
			System.out.println("Net Salary:"+Net_sal);
		}
		
	public static void main(String args[])
	{
		Employee e = new Employee(1,"Amit",10000,12.5);
		
		e.calcHRA();
		e.calcPF();
		e.calcGross();
		e.calcNet_sal();
		e.EmpDetail();		
	}
}
