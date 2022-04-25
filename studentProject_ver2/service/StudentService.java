package service;

import java.util.Scanner;

import vo.*;

public class StudentService {
	private static StudentService instance = new StudentService();
	
	public static StudentVO[] arr;
	private int index;
	
	
	private StudentService() {
		arr = new StudentVO[10];
		index = 0;
		arr[index++]= new StudentVO("20201111", "홍길동", "컴퓨터공학과", 3.14);
		arr[index++]= new StudentVO("20201112", "김철수", "경영학과", 4.2);
		arr[index++]= new StudentVO("20201113", "이영희", "경제학과", 2.24);
		arr[index++]= new StudentVO("20201114", "박영수", "생활체육학과", 1.56);
		
		
	}
	
	
	
	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}



	public void registerStudent(StudentVO vo) {
		if(index == arr.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return;
		}
		arr[index++]= vo;
		System.out.println("학생정보 등록이 완료되었습니다....");

	}
	
	public void printAllStudentInfo() {
		
		if(index ==0) {
			System.out.println("저장된 학생 정보가 없습니다.");
			return;
		}
		
		for(int i=0;i<index;i++) {
			arr[i].printStudentInfo();	  
		}
		
	}
	
	public int searchStudent(Scanner sc) {
		System.out.print("조회할 학번 입력 : ");
		String studentNo=sc.nextLine();
		
		  for(int i=0;i<index;i++){
		  		if(arr[i].getStudentNo().equals(studentNo)) {
		  			arr[i].printStudentInfo();
		  			return i;
		  		}
		  }
		  
		  System.out.println("입력한 학번에 대한 학생 정보가 없습니다.");
	
		 return -1;
	}	
	
	public void updateStudent(Scanner sc) {//기능명+어떤 것을 가지고 일을한다. 메서드 명 짓는 방법
		
		System.out.println("학생정보 수정을 시작합니다...");
		int i = searchStudent(sc);
		
		if(i == -1) return;
		
		//if문을 안써도 i값은 0이상이다.
		
		System.out.print("수정할 이름 : ");
		arr[i].setName(sc.nextLine());
		System.out.print("수정할 학과 : ");
		arr[i].setMajor(sc.nextLine());
		System.out.print("수정할 평점 : ");
		arr[i].setScore(sc.nextDouble());
		sc.nextLine();
		System.out.println("학생 정보 수정이 완료되었습니다.");
		
	}//updateStudent
	
	public void deleteStudent(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다........");
		int i = searchStudent(sc);
		if(i == -1) return;
		
		
		while(i < index) {
			arr[i] = arr[i+1];
			i++;
		}
		index--;
		System.out.println("삭제 작업을 완료하였습니다.");
	}
	
	public void maxScoreStudent() {
		StudentVO max = arr[0];
		for(int i=0;i<index;i++) {
			if(max.getScore() < arr[i].getScore())
				max = arr[i];
		}
		
		System.out.println("전체석차 1등");
		max.printStudentInfo();
		
	}//maxScoreStudent_method
	
	public void testStudent() {
		StudentVO test = arr[0];
		test.printStudentInfo();
	}
	
}//class
