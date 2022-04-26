package abstract_method;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Dog();
		//추상클래스도 변수 타입을 선언은 가능하지만 생성은 불가능하다.
		animal.eat();
		animal = new Person();
		animal.eat();
		
	}

}
