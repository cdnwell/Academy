package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class PrintAllController implements Controller {

//	if(index ==0) {
//		System.out.println("저장된 학생 정보가 없습니다.");
//		return;
//	}
//	
//	for(int i=0;i<index;i++) {
//		arr[i].printStudentInfo();	  
//	}

	@Override
	public void execute(Scanner sc) {
//		int index=StudentService.getInstance().getIndex();
//		StudentVO []arr=StudentService.getInstance().getArr();
//		if(index==0) {
//			System.out.println("저장된 학생 정보가 없습니다.");
//			return;
//		}
//		
//		for(int i=0;i<index;i++) {
//			arr[i].printStudentInfo();	  
//		}
		
		
//		예시 2]
		
		//index 받음
		int index = StudentService.getInstance().getIndex();
		if(index == 0) {
			System.out.println("학생 데이터가 하나도 없습니다.");
			return;
		}
		
		//배열 받음
		StudentVO[] arr = StudentService.getInstance().getArr();
		for(int i=0;i<index;i++) {
			arr[i].printStudentInfo();
		}
		
	}

}
