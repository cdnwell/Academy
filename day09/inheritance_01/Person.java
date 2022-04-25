package inheritance_01;

public class Person extends Animal{
	//생성자는 상속의 대상이 아니다.
	//eat 메서드만 상속 받음

	public Person() {
		System.out.println("Perosn 생성자");
	}
	
	public void run() {
		System.out.println("사람이 달립니다.");
	}
	
	public void printAge() {
		System.out.println("이 사람의 나이 : "+age);
	}

	@Override
	//@Override 어노테이션
	//@Override가 검사함 eat1()이라하면 오류 줄
	public void eat() {
		//animal이 가지고 있는 eat() 메서드
		System.out.println("사람이 밥을 먹습니다.");
	}

}
