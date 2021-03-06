package constructor;

public class Person extends Animal{
	private String name;

	//자식 생성자가 부모 생성자에 필요한 값을 받아서
	//부모 생성자에게 전달한다. --> super(인자값...) : 부모 생성자 호출
	public Person(int age, String name) {
		super(age);			//super --> 부모 클래스, 부모 클래스명 == super
		this.name = name;
	}
	
	public void printPersonInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}
	
}
