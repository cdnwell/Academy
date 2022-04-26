package final_method;

public class FinalMain {

	public static void main(String[] args) {
		Person p = new Person(20);
		p.printAnimalInfo();
		//final 메서드는 실행은 되지만 재정의는 안 된다.
		
	}

}
