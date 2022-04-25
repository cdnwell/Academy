package employee;

import java.util.Scanner;

public class EmployeeService {
	private Employee[] arr;
	private int index;
	
	public EmployeeService() {
		index=0;
		arr = new Employee[10];	
		
		arr[index++] = new Employee("A0001","홍씨",200);
		arr[index++] = new SalaryEmployee("A0002","김씨",200,30);
		arr[index++] = new DispatchEmployee("A0003","이씨",150,'A');
		arr[index++] = new Employee("A0004","임씨",200);
		arr[index++] = new Employee("A0005","전씨",200);
		
	}
	
	public void registerEmployee(Scanner sc) {
		//배열 개수 늘리기
		//배열 개수가 늘어나야 할 때 : 배열이 꽉찼을 때
		
		if(index == arr.length) {
			Employee[] temp = arr;
			arr = new Employee[arr.length+3];
			
			
 		}
		
//		System.out.println("현재 최대 배열 개수 : "+arr.length);
//		System.out.print("늘릴 칸수 : ");
//		int num=sc.nextInt(); sc.nextLine();
		
		Employee[] tmp = arr;
		
//		arr = new Employee[num];
		
		for(int i=0;i<tmp.length;i++) {
			arr[i]=tmp[i];
		}
		
//		System.out.println("현재 최대 배열 개수 : "+arr.length);
//		System.out.println("배열 복사 완료!");
		
		
		//사원정보 등록
		//1 - 일반사원, 2 - 영업직, 3 - 파견직을 구분해서 입력 받은 후
		//arr에 등록
		
		System.out.println("사원 정보 등록을 시작합니다.......");
		System.out.println("1 - 일반 사원");
		System.out.println("2 - 영업직 사원");
		System.out.println("3 - 파견직 사원");
		System.out.print("원하시는 번호 : ");
		int no = sc.nextInt(); sc.nextLine();
		
		System.out.print("\n사원번호 입력 : ");
		String eno = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("기본급 입력 : ");
		int salary = sc.nextInt(); sc.nextLine();
		
//		if(no == 2) {
//			System.out.print("영업포인트 입력 : ");
//			int point = sc.nextInt(); sc.nextLine();
//			arr[index++] = new SalaryEmployee(eno, name, salary, point);
//		}else if(no == 3) {
//			System.out.print("파견직 위험도 입력 : ");
//			char danger = sc.nextLine().charAt(0);
//			/* 입력받은 문자열의 첫번째 글자를 뽑겠다. */
//			arr[index++]= new DispatchEmployee(eno, name, salary, danger);
//		}else {
//			arr[index++] = new Employee(eno, name, salary);
//		}
		
		switch(no) {
		case 1:
			arr[index++] = new Employee(eno, name, salary);
			break;
		case 2:
			System.out.print("영업포인트 입력 : ");
			int point = sc.nextInt(); sc.nextLine();
			arr[index++] = new SalaryEmployee(eno, name, salary, point);
			break;
		case 3:
			System.out.print("파견직 위험도 입력 : ");
			char danger = sc.nextLine().charAt(0);
			arr[index++]= new DispatchEmployee(eno, name, salary, danger);
			break;
		}
		
		System.out.println("사원정보 등록 완료");
		
//		System.out.println("1 - 일반사원, 2 - 영업직, 3 - 파견직");
//		System.out.print("번호 입력 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		예제 1]		
//		switch (num) {
//		case 1:
//			System.out.print("사원번호 : ");
//			String eno = sc.nextLine();
//			System.out.print("이름 : ");
//			String name = sc.nextLine();
//			System.out.print("급여 : ");
//			int salary = sc.nextInt();
//			sc.nextLine();
//			arr[index++] = new Employee(eno,name,salary);
//			break;
//		case 2:
//			System.out.print("사원번호 : ");
//			eno = sc.nextLine();
//			System.out.print("이름 : ");
//			name = sc.nextLine();
//			System.out.print("급여 : ");
//			salary = sc.nextInt();
//			sc.nextLine();
//			System.out.print("보너스 : ");
//			int point = sc.nextInt();
//			sc.nextLine();
//			arr[index++] = new SalaryEmployee(eno,name,salary,point);
//			break;
//		case 3:
//			System.out.print("사원번호 : ");
//			eno = sc.nextLine();
//			System.out.print("이름 : ");
//			name = sc.nextLine();
//			System.out.print("급여 : ");
//			salary = sc.nextInt();
//			sc.nextLine();
//			System.out.print("보너스 : ");
//			String danger = sc.nextLine();
//			sc.nextLine();
//			arr[index++] = new DispatchEmployee(eno,name,salary,danger);
//			break;
//		}
		
	}
	
	public void printAllEmployee() {
		for(int i=0;i<index;i++) {
			System.out.print("사원정보 출력.....");
			arr[i].printEmployeeInfo();
		}
	}
 
	
}
