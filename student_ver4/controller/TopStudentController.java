package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class TopStudentController implements Controller {

//	StudentVO max = arr[0];
//	for(int i=0;i<index;i++) {
//		if(max.getScore() < arr[i].getScore())
//			max = arr[i];
//	}
//	
//	System.out.println("전체석차 1등");
//	max.printStudentInfo();

	
	@Override
	public void execute(Scanner sc) {
		
//		StudentVO[] arr = StudentService.getInstance().getArr();
//		StudentVO max = arr[0]; 
//		int index=StudentService.getInstance().getIndex();
//		for(int i=0;i<index;i++) {
//			if(max.getScore() < arr[i].getScore())
//				max = arr[i];
//		}
		
		ArrayList <StudentVO> list=StudentService.getInstance().maxScoreStudent(); 
		
//		if(vo==null)
//			System.out.println("학생 데이터가 하나도 없습니다.");
//		else
//			vo.printStudentInfo();
		
//		for(int i=0;i<listmax.size();i++) {
//			listmax.get(i).printStudentInfo();
//		}
//		System.out.println();
		
		if(list == null) {
			System.out.println("학생 데이터가 하나도 없습니다.");
			return;
		}
		
		for(StudentVO vo : list) {
			vo.printStudentInfo();
		}
		
		for(int i=0;i<list.size();i++) {
			
		}
			
	}

}
