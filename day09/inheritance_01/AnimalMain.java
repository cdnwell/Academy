package inheritance_01;

public class AnimalMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.printAge();
		
	}

}

/* 상속(Inheritance)
 * 		- 부모 클래스가 자식 클래스에게 자신이 가지고 있는 필드 및 메서드를 물려주는 행위
 * 		- 자식은 부모의 private 멤버에 접근을 할 수 없다.
 * 		- 자바는 부모 클래스를 1개만 가질 수 있다.
 * 
 * 상속의 장점
 * 		- 코드를 재사용 할 수 있다.
 * 		- 부모와 자식의 관계를 만들어 준다.
 * 
 * protected : 해당 클래스를 상속을 받은 자식(자손) 클래스까지는 접근할 권한이 있다.
 * 				외부에서는 접근이 불가능하다.
 * 
 * 오버라이딩(Overriding, Override) : 부모로부터 상속받은 메서드를 재구현  
 *  								메서드 명 동일, 매개변수 동일, 접근제어자도 동일
 *  
 * 오버로딩(Overloading) : 메서드 중복 정의 방법, 여러개 만드는 것
 * 						1. 매개 변수 개수가 다르거나
 * 						2. 매개 변수 개수가 같다면, 매개변수 타입을 서로 다르게 하면 됨
 * 
 * 자식 메서드 안에 오버라이딩된 메서드를 명령하면 자식 메서드 부터 쓴다.
 * 
 * 
 * 
 */
