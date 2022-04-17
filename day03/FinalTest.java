
public class FinalTest {

	public static void main(String[] args) {
		//일반 변수는 값을 계속 변경 가능
		int num = 100;
		num += 100;
		num--;
		System.out.println(num);
		//상수
		final int i = 100;
		//i++;	//final 키워드로 선언되면 변수가 상수가 됨, 최초 저장한 값을 변경할 수 없음
		System.out.println(i * 100);	//변수는 조작 할 수 없다 결과 값은 가능
		
		final double pi;
		pi = 3.1415;	//한번은 초기화를 할 수 있음, 초기화 이후에는 바꿀 수 없다.
		//값이 없이 선언 가능
		
		
	}

}
