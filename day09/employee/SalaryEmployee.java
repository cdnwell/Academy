package employee;

public class SalaryEmployee extends Employee{
	private int point;
	
	public SalaryEmployee(String eno, String name,int salary, int point) {
		super(eno, name, salary);
		this.point = point;
		
	}

//	@Override
//	public int getSalary() {
//		int pay = super.getSalary() + point * 20 / 100;  
//		
//		return pay;
//	}

	@Override
	public int getSalary() {
		
		return (int)(point * 0.2 + salary);
		
	}
	
}
