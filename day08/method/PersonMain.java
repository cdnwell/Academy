package method;

public class PersonMain {
	
	public static void addAge(Person p) {
		p.setAge(p.getAge()+10);
		//Person 클래스의 age 10을 증가시킨다.
	}//call by reference 메서드
	//reference에서 값을 바꿈
	//p는 메모리 주소를 받기 때문에
	//레퍼런스 형은 원본에 접근해서 값을 변경할 수 있다.
	
	//static은 non static에 접근할 수 없다. static메서드로 만들어 주어야한다.
	
	//고정형 형태의 변수는 값을 직접 받기떄문에
	//원본에 접근할 수가 없다.
	public static void add(int num) {
		num += 10;
	}//call by value 값을 보내준다. 값은 안바뀐다.

	public static void main(String[] args) {
		Person s = new Person("홍길동",20);
		System.out.println(s.toString());
		addAge(s);
		System.out.println(s.toString());
		
		int a=100;
		add(a);
		System.out.println(a);
		
		
		
	}

}
