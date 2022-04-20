package method;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("나길동",10);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.food);
//		p1.info();
		
		p1.inputAge(30);
		System.out.println(p1.age);
		p1.setFood("냉면");
		p1.setFood("김밥");
		p1.setFood("라면");
		p1.setFood("돈까스");
		System.out.println(p1.getFood());
		
	}

}
