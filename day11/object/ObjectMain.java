package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동",20);
		Person s = new Person("홍길동",20);
		
		System.out.println(p);
		System.out.println(p.toString());
		
		System.out.println(p.hashCode());
		System.out.println(s.hashCode());
		//hashCode - 코드 내용이 같으면 같은 값을 반환
		
		System.out.println(p.equals(s));
		
		System.out.println();
		System.out.println(new Person("김길동",20));
//		System.out.println(new Dog("a",3));
		
		System.out.println();
		Dog dog = new Dog("a",2);
		
	}

}
