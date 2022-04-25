package inheritance_02;

public class EmployeeMain {
	//Employee는 SalaryEmployee, DispatchEmployee까지. 올 수 있다. (자식 클래스라서)
	public static void work(Employee e) {
		e.work();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		SalaryEmployee e2 = new SalaryEmployee();
		DispatchEmployee e3= new DispatchEmployee();
		
		work(e1);
		work(e2);
		work(e3);
		//다형성, 상속을 배우는 이유는 다형성의 비중이 크다.
	}

}

/*
 * 
 * 다운캐스팅 > 괄호 하고 명시적 형변환 필요
 * 
 */
