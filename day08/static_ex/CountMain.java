package static_ex;

public class CountMain {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		Count c5 = new Count();
		//static 변수나 메서드에 접근을 할때는 해당클래스명.변수명 or 해당클래스명.메서드명()
		System.out.println(Count.total_count);
		//클래스명.static변수
		//첫번째 클래스 전체, 그다음 그 변수가 속한 영역(클래스,메서드)
		System.out.println(c1.total_count);
		//일반적으로 이렇게 쓰진 않음
		//static변수 처음 한번만 실행
		System.out.println(c1.getStr());
		System.out.println(Count.getStr());
		//static선언 변수 private으로 많이 쓴다.
		//클래스 내에서만 선언
		
	}

}
