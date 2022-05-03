package anonymous;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};	//구현 안된 부분 실제로 구현, 오버라이딩 사용
		animal.eat();
		Animal human= new Animal() {
			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다");
			}
		};
		human.eat();
		
	}

}
