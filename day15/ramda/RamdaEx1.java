package ramda;

public class RamdaEx1 {

	public static void main(String[] args) {
		Calcurator plus = new Calcurator() {
			
			public int calc(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};//추상메서드를 통해 익명함수를 만들었다.
		
		System.out.println(plus.calc(10,20));
		
		//변수 타입 안써도 알아서 맞춰준다.
		Calcurator minus = (a,b) -> a-b;
		System.out.println(minus.calc(5, 3));
		//1.8버전 이전은 안됨 버전8 이전 안됨
		//추상메서드는 무조건 한개 두개이상하면 에러난다.
		
		Calcurator total = (a,b) -> {
			int sum =0;
			for(int i=a ; i<=b;i++) {
				sum += i;
			}
			return sum; 
		}; 
		//두 줄 이상이면 굳이 람다식을 쓰지 않는 편이다.
		System.out.println(total.calc(1,100));
		//리턴값이 없어도 된다.
		//람다식 : 길어지면 알아보기 힘듬
	}

}
