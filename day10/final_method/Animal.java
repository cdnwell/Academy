package final_method;

public class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
	}
	
	public final void printAnimalInfo() {
		System.out.println("이 동물의 나이 : "+age);
	}
	//final 클래스는 부모클래스로만 못쓰는 것이다. 다른 용도는 활용 가능함
}
