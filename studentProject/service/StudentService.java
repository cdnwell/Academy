package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[] arr;
	private int index;

	public StudentService() {
		arr = new StudentVO[10];
		index = 0;
	}
	
	public void registerStudent(Scanner sc) {
		System.out.println("학생 정보 등록을 시작합니다.");
		
		if(index == arr.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return;
		}
		
		//학생 정보 입력
		System.out.print("학번 : ");
		String studentNo=sc.nextLine();
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("학과 : ");
		String major=sc.nextLine();
		System.out.print("평균 : ");
		double score=sc.nextDouble();
		sc.nextLine();	//엔터를 지움, 숫자를 입력 받고 마지막 엔터를 없애주어야 한다. 자바에서는
		
		//arr에 입력받은 정보를 이용해서 Student 생성하여 저장
		//생성자 만들 떄 이름을 같이 해주면 자동으로 매칭이된다.
		
		arr[index]= new StudentVO(studentNo, name, major, score);
//		arr[index]=new StudentVO("", "", "", 0);
//		arr[index].setStudentNo(studentNo);
//		arr[index].setName(name);
//		arr[index].setMajor(major);
//		arr[index].setScore(score);
		
		//생성자는 배열이 만들어질 때 같이 만들어지지 않는다.
		
		//index 증가
		index++;
		System.out.println("학생정보 등록이 완료되었습니다....");

	}
	
	public void printAllStudentInfo() {
		
		if(index ==0) {
			System.out.println("저장된 학생 정보가 없습니다.");
			return;
			//안해줘도 상관없다 for문 조건식 때문에 실행이 안됨
		}
		
		for(int i=0;i<index;i++) {
			arr[i].printStudentInfo();	//한건씩 출력하는 부분
//			System.out.println(arr[i].toString());
		}
		
	}
	
}
