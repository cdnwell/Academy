package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class UpdateController implements Controller {
	/*
	 * updatecontroller는 서비스가 필요하지 않고 controller에서만 수행된다.
	 */
	
//	System.out.println("학생정보 수정을 시작합니다...");
//	int i = searchStudent(sc);
//	
//	if(i == -1) return;
//	
//	//if문을 안써도 i값은 0이상이다.
//	
//	System.out.print("수정할 이름 : ");
//	arr[i].setName(sc.nextLine());
//	System.out.print("수정할 학과 : ");
//	arr[i].setMajor(sc.nextLine());
//	System.out.print("수정할 평점 : ");
//	arr[i].setScore(sc.nextDouble());
//	sc.nextLine();
//	System.out.println("학생 정보 수정이 완료되었습니다.");

	@Override
	public void execute(Scanner sc) {
//		System.out.println("학생정보 수정을 시작합니다...");
//		
//		System.out.print("수정할 학생번호를 입력해주세요 : ");
//		String studentNo=sc.nextLine();
//		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);
//		
//		if(vo==null) {
//			System.out.println("해당 학생번호의 학생이 존재하지 않습니다.");
//		}else {
//			System.out.print("수정할 이름 : ");
//			vo.setName(sc.nextLine());
//			System.out.print("수정할 학과 : ");
//			vo.setMajor(sc.nextLine());
//			System.out.print("수정할 평점 : ");
//			vo.setScore(sc.nextDouble());
//			sc.nextLine();
//
//		}
		
		
//		예시2]
		System.out.println("학생 정보 수정을 시작합니다........");
		System.out.print("수정할 학생번호 입력 : ");
		String studentNo=sc.nextLine();
		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);
		
		if(vo == null) {
			System.out.println("입력한 학번에 해당하는 학생이 없습니다.");
			return;
		}
		
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("학과 : ");
		String major=sc.nextLine();
		System.out.print("평균 : ");
		double score=sc.nextDouble();
		sc.nextLine();
		
		vo.setName(name);
		vo.setMajor(major);
		vo.setScore(score);
		
	}

}
