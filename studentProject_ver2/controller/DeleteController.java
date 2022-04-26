package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class DeleteController extends Controller {
	
	@Override
	public void execute(Scanner sc) {

		System.out.println("학생정보 삭제를 시작합니다........");
//		
//		int i = searchStudent(sc);
//		if(i == -1) return;
//		
//		while(i < index) {
//			arr[i] = arr[i+1];
//			i++;
//		}
//		index--;
//		System.out.println("삭제 작업을 완료하였습니다.");
		
//		예시 1]
//		int num = sc.nextInt();
//		StudentService.getInstance().deleteStudent(num);
		
		
//		예시 2]
		System.out.print("삭제할 학번을 입력하세요 : ");
		String studentNo = sc.nextLine();
		
		boolean result = StudentService.getInstance().deleteStudent(studentNo);
		
		if(result)
			System.out.println("학생 정보가 정상적으로 삭제 되었습니다.");
		else
			System.out.println("삭제할 학생 정보가 없습니다.");
		
	}
}
