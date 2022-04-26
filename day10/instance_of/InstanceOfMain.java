package instance_of;

public class InstanceOfMain {
	
	public static void run(Animal a) {
		if(a instanceof Person) {
			//형변환이 되는 지 묻는것
//			Person p = (Person) a;
//			p.printPerson();
			((Person) a).printPerson();
		}
		if(a instanceof Dog) {
			((Dog) a).printDog();
		}
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p; //업캐스팅은 자동으로 됨
		Person s = (Person) a;
		
		a=s;
//		Dog g = (Dog) a;
		//문법 오류 없음
		
		System.out.println(a instanceof Person);
		System.out.println(a instanceof Dog);
		//if문 조건문에 자주 나온다. true false 반환
		System.out.println(p instanceof Animal);
		System.out.println("Object, instanceof....");
		System.out.println(a instanceof Object);
		System.out.println(p instanceof Object);
		System.out.println("프로그램 종료");
		
		run(p);
		run(new Dog());
		run(a);
		run(s);
	}

}
