package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	/*
	 * List의 특징
	 * 		1. 데이터 중복 0 (중복된 데이터도 저장한다)
	 * 		2. 리스트에 등록한 데이터 순서가 보장됨
	 * 
	 * ArrayList : 리스트에서 데이터를 배열로 관리
	 * LinkedList : 리스트에서 데이터를 객체들끼리 엮어서 관리
	 * Vector : ArrayList에 동기화가 적용된 형태
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//데이터 추가 - 순서대로 저장됨
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("HTML/CSS");	//중복된 데이터도 저장됨
		list.add("jsp");
		
		System.out.println(list.toString());
		
		//set : 중복 데이터 저장 안하는 것
		
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(0);
		System.out.println(list.toString());
		//데이터 삭제 - 객체 비교 삭제 --> equals()를 재정의를 해놔야함
		//재정의를 안하면 메모리 주소로만 비교
		
		list.remove("java");
		System.out.println(list.toString());
		
		//현재 리스트가 저장하고 있는 데이터 개수
		System.out.println(list.size());
		
		//해당 데이터가 리스트에 있는지 물어보는 것이다. 있으면 true 없으면 false
		System.out.println(list.contains("jsp"));
		System.out.println(list.contains("android"));
		
		//리스트 모든 요소를 제거
		//list.clear();
		//리스트 내용이 비었는지 체크
		System.out.println(list.isEmpty());
		
		//리스트에 원하는 인덱스에 데이터를 추가
		//데이터를 지우고 추가 하는 것이 아님
		list.add(1,"android");
		System.out.println(list);
		//toString이 만들어져있으면 toString메서드를 안불러와도 배열안에 모든 것 불러옴
		
		//리스트에 있는 모든 객체 꺼내는 방법 - 1
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//리스트에 있는 모든 객체 꺼내는 방법 - 2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//다음 지점으로 이동을 한 뒤 값을 꺼낸다.
		//hasNext : 현재 인덱스 번호랑 사이즈 비교
		//next : 현재 인덱스 값 반환, 인덱스 +1
		
		//이중리스트 주소값 두개
		
		//벡터 동기화
	}

}
