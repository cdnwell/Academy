package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class SearchController implements Controller {
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생번호를 이용해서 조회를 시작합니다...........");
		System.out.print("조회할 학번 입력 : ");
		String studentNo=sc.nextLine();
		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);
		
		if (vo == null) {
			System.out.println("입력한 학번에 해당하는 학생이 없습니다.");
		}else {
			vo.printStudentInfo();
		}
		
	}
	
	
}
