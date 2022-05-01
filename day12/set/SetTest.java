package set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	/*
	 * 	Set
	 * 		1. 중복 X
	 * 		2. 자동 정렬
	 * 	
	 * 		주로 오류값을 저장할 때 많이 사용한다.
	 * 		treeset,hashset이 있다.
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		//Set계열 들은 모두 Set인터페이스를 가지고 있다.
		//Set이 달라져도 다 같이 씀
		
		//데이터 등록
		set.add("HTML/CSS");
		set.add("js/jQuery");
		set.add("JAVA");
		set.add("Spring");
		set.add("js/jQuery");
		set.add("Android");
		set.add("JAVA");
		
		System.out.println(set);
		
		//데이터 삭제
		set.remove("JAVA");
		System.out.println(set);
		
		//데이터 개수 조회
		System.out.println(set.size());
		
		//데이터 검색
		System.out.println(set.contains("Spring"));
		
		//데이터 존재 유무
		System.out.println(set.isEmpty());
		
		//set에 내용 비우기
		//set.clear();
		
		//전체 조회
		//1.Set의 내용을 배열로 받아서 조회
		//형변환해서 arr 배열에 넣을 수 없다. 형변환 안됨
		//실행이 안됨
//		String [] arr = (String[])set.toArray();
		System.out.println();
		//------------------------
		Object[] arr = set.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		//형변환 하지 않고 iterator로 조회 가능
		
		//2.Iterator
		//set이든 list든 둘다 iterator 가능 형변환 안해도 되서 
		//더 편리
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
