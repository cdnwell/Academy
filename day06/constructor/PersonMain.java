package constructor;

public class PersonMain {

	public static void main(String[] args) {

		//new로 만들면 대게 기본값으로 초기화
		Person p1=new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		Person p2=new Person("김철수");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		Person p3=new Person(30);
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.gender);
		//파라미터 = 메소드에 있는 변수, 아규먼트/arg = 메소드에 전달해주는 값
		Person p4=new Person("이길동",20);
		System.out.println(p4.name);
		System.out.println(p4.age);
		System.out.println(p4.gender);

	}

}
