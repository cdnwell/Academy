package field;

public class PersonMain {

	public static void main(String[] args) {
		//같은 패키지에 있으면 import 안씀
		//new 메모리 할당하여 Person 객체를 만듬
		Person p1 = new Person();
		System.out.println(p1);

		Person p2 = new Person();
		System.out.println(p2);
		// . <- 접근지정연산자 왼쪽에 있는 변수에 있는 값에 접근한다.
		p1.name="홍길동";
		System.out.println(p1.name);
		p1.age=20;
		System.out.println("나이:"+p1.age);
		p2.name="김철수";
		System.out.println(p2.name);
		p2.age=30;
		System.out.println("나이:"+p2.age);
		System.out.println();
		
		Student s1 = new Student();
		s1.num="131124";
		s1.name="이길동";
		s1.className="프로그래밍학과";
		s1.avr=3.5;
		
		System.out.println("이름:"+s1.name);
		System.out.println("학번:"+s1.num);
		System.out.println("학과:"+s1.className);
		System.out.println("평점:"+s1.avr);
		
		System.out.println();
		
		Student s2 = new Student();
		s2.name="나철수";
		s2.num="116844";
		s2.className="프로그래밍학과";
		s2.avr=3.6;
		
		System.out.println("이름:"+s2.name);
		System.out.println("학번:"+s2.num);
		System.out.println("학과:"+s2.className);
		System.out.println("평점:"+s2.avr);
		
		System.out.println();
		
		int n=00123416;
		//앞에 0이 들어가면 8진수다.
		//8이상을 넣을 수 없다.
		System.out.println(n);
		
		//그래서 학번을 String으로 받는다.
		
		
	}

}
