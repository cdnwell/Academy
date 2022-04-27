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
	
	public StudentVO searchStudent(String studentNo) {
		
		  for(int i=0;i<index;i++){
		  		if(arr[i].getStudentNo().equals(studentNo)) {
		  			return arr[i];
		  		}
		  }
		  
		  System.out.println("입력한 학번에 대한 학생 정보가 없습니다.");
	
		 return null;
	}	
	
	public boolean deleteStudent(String studentNo) {
//		System.out.println("학생정보 삭제를 시작합니다........");
//		int i = searchStudent(sc);
//		if(i == -1) return;
//		
//		while(i < index) {
//			arr[i] = arr[i+1];
//			i++;
//		}
//		index--;
//		System.out.println("삭제 작업을 완료하였습니다.");
		
//		예제 2]
		
		boolean flag = false;
		
		for(int i=0; i<index;i++) {
			if(studentNo.equals(arr[i].getStudentNo())) {
				flag = true;
				while(i<index) {
					arr[i]=arr[i+1];
					i++;
				}
				index--;
			}
		}
		
		return flag;

	}
	
	public StudentVO maxScoreStudent() {
		if(index==0)
			return null;
		
		StudentVO max = arr[0];
		
		for(int i=0;i<index;i++) {
			if(max.getScore() < arr[i].getScore())
				max = arr[i];
		}
		
		return max;
//		System.out.println("전체석차 1등");
//		max.printStudentInfo();
		
	}//maxScoreStudent_method
	
	public void testStudent() {
		StudentVO test = arr[0];
		test.printStudentInfo();
	}
	
	public int getIndex() {
		return index;
	}

	public StudentVO[] getArr() {
		return arr;
	}
	
//	public StudentVO[] getStudentVO(){
//		
//		return arr;
//	}
	
	
	
}//class
