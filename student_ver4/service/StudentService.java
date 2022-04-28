package service;

import java.util.ArrayList;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	
	public  ArrayList<StudentVO> list;
	
	private StudentService() {
		list = new ArrayList<StudentVO>();
		list.add(new StudentVO("20201111", "홍길동", "컴퓨터공학과", 4.3));
		list.add(new StudentVO("20201112", "김철수", "경영학과", 3.0));
		list.add(new StudentVO("20201113", "이영희", "경제학과", 4.3));
		list.add(new StudentVO("20201114", "박영수", "생활체육학과", 4.3));
		
	}
	
	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public ArrayList<StudentVO> getList() {
		return list;
	}
	
	public boolean registerStudent(StudentVO vo) {
//		if(index == arr.length) {
//			System.out.println("더 이상 저장할 공간이 없습니다.");
//			return;
//		}
//		arr[index++]= vo;
		
//		예시1]
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getStudentNo().equals(vo.getStudentNo())){
//				System.out.println("이미 있는 학생번호입니다.");
//				System.out.println("추가가 되지 않습니다.");
//				return;
//			}
//		}
//		list.add(vo);
		
		//contains, equals 사용
//		
//		예시2]
		if(list.contains(vo)) {
//			System.out.println("학생번호가 중복되었습니다.....");
			return false;
		}
		return list.add(vo);
		
		
//		if(list.contains(vo.getStudentNo())) {
//			System.out.println("이미 있는 학생번호입니다.");
//			System.out.println("추가가 되지 않습니다.");
//		}else {
//			list.add(vo);
//		}
			
		
//		System.out.println("학생정보 등록이 완료되었습니다....");

	}
	
	public StudentVO searchStudent(String studentNo) {
		
//		  for(int i=0;i<index;i++){
//		  		if(arr[i].getStudentNo().equals(studentNo)) {
//		  			return arr[i];
//		  		}
//		  }
		
//		예시 1]
//		StudentVO vo=null;
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getStudentNo().equals(studentNo)) {
//				vo=list.get(i);
//			}
//		}
//		StudentVO vo = new StudentVO(studentNo,null,null,0);
		
		int i =list.indexOf(new StudentVO(studentNo,null,null,0));
		if(i == -1) {
			return null;
		}
		
		return list.get(i);

//		  System.out.println("입력한 학번에 대한 학생 정보가 없습니다.");
	
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
		
//		boolean flag = false;
		
//		for(int i=0; i<index;i++) {
//			if(studentNo.equals(arr[i].getStudentNo())) {
//				flag = true;
//				while(i<index) {
//					arr[i]=arr[i+1];
//					i++;
//				}
//				index--;
//			}
//		}
		
//		return flag;
		
		//remove, 객체 비교
		//예시1]
		
//		StudentVO vo = new StudentVO(studentNo,null,null,0);
//		int i = list.indexOf(vo);
//		
//		if (i == -1)
//			return false;
//		list.remove(i);
//			return true;
		
//		예시2]
		return list.remove(new StudentVO(studentNo,null,null,0));

	}
	
	public ArrayList<StudentVO> maxScoreStudent() {
//		if(index==0)
//			return null;
//		
//		StudentVO max = arr[0];
//		
//		for(int i=0;i<index;i++) {
//			if(max.getScore() < arr[i].getScore())
//				max = arr[i];
//		}
//		
//		return max;
//		System.out.println("전체석차 1등");
//		max.printStudentInfo();
		
		//성적이 제일 높은 같은 점수 다 구하기
//		예시1]
//		if(list.size()==0)
//			return null;
//		
//		ArrayList<StudentVO> listmax = new ArrayList<StudentVO>();
//		int count =0;
//		StudentVO voMax=list.get(0);
//		for(int i=0;i<list.size();i++) {
//			if(voMax.getScore()<list.get(i).getScore()) {
//				voMax =list.get(i);
//				count=0;
//			}else if(voMax.getScore()==list.get(i).getScore() && count ==0) {
//				count++;
//				listmax.clear();
//				listmax.add(list.get(i));
//			}else if(voMax.getScore()==list.get(i).getScore() && count >0) {
//				listmax.add(list.get(i));
//			}
//		}
//		
//		return listmax;
		
		//똑같은 것들 추가하기
//		예시2]
		
		if(list.isEmpty()) return null;
		
		StudentVO max = list.get(0);
		
		for(int i=0;i<list.size();i++) {
			if(max.getScore() < list.get(i).getScore())
				max=list.get(i);
		}
		
		ArrayList<StudentVO> result = new ArrayList<StudentVO>();
		//정수 최대값과 같은 StudentVO를 result에 추가
		
		for(int i=0;i<list.size();i++) {
			if(max.getScore()==list.get(i).getScore()) {
				result.add(list.get(i));
			}
		}
		
		return result;
		
	}//maxScoreStudent_method

	
	
//	public void testStudent() {
//		StudentVO test = arr[0];
//		test.printStudentInfo();
//	}
	
//	public int getIndex() {
//		return index;
//	}
//
//	public StudentVO[] getArr() {
//		return arr;
//	}
	
//	public StudentVO[] getStudentVO(){
//		
//		return arr;
//	}
	
	
	
}//class
