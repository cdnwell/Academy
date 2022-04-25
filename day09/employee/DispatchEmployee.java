package employee;

public class DispatchEmployee extends Employee {
//	private String danger;
	private char danger;
	
	public DispatchEmployee(String eno, String name, int salary, char danger) {
		super(eno, name, salary);
		this.danger = danger;
	}

	@Override
	public int getSalary() {
		switch (danger) {
		case 'A':
			return salary + (int)(salary*0.5);
		case 'B':
			return salary + (int)(salary*0.3);
		case 'C':
			return salary + (int)(salary*0.2);
		default:
			return salary + (int)(salary*0.1);
		}
	}
	
//	예제1]
//	@Override
//	public int getSalary() {
//		int pay=salary;
//		if(danger.equals("A")) {
//			pay = (int)(salary * 1.5);
//		}else if(danger.equals("B")) {
//			pay = (int)(salary * 1.3);
//		}else if(danger.equals("C")) {
//			pay = (int)(salary * 1.2);
//		}
//		return pay;
//	}
	
	public char getDanger() {
		return danger;
	}

}
