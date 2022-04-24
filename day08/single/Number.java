package single;

public class Number {
	private static Number instance = new Number();
	//힙 영역 instance , static영역 생성자, static이 힙을 가리키고 있음
	private int count;
	
	private Number() {
		System.out.println("Number 객체 생성");
		count++;
	}
	
	public static Number getInstance() {
		if(instance == null)
			instance = new Number();
		//instacne == null, 아직 만들어져 있지 않다.
		
		return instance;
	}
	 
	//private으로 자신을 생성 1, private 생성자 2, static 메서드 instance 반환 
	
	public int getCount() {return count;}
	
}

//헤드퍼스트 디자인패턴 pdf 파일이 있다. 책, 싱글톤에 관련된 책이다.