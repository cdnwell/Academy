package employee;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
//		SalaryEmployee se1=new SalaryEmployee("123","홍길동",100);
//		System.out.println("급여 : "+se1.getSalary());
		Scanner sc = new Scanner(System.in);
//		SalaryEmployee emp = new SalaryEmployee("ABC0001", "홍길동", 100, 500);
//		emp.printEmployeeInfo();
//		
//		DispatchEmployee emp1 = new DispatchEmployee("ABC0013", "김철수", 100, 'C');
//		emp1.printEmployeeInfo();
		
		EmployeeService emp2 = new EmployeeService();
//		emp2.registerEmployee(sc);
		emp2.printAllEmployee();
		
		
	}

}
