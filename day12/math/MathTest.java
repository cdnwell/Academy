package math;

public class MathTest {

	public static void main(String[] args) {
		//절대값-무조건 양수로 만들어줌
		System.out.println(Math.abs(-100));
		
		//올림
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(-3.4));
		
		//내림
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(-3.4));
		
		//반올림
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(-3.4));
		
		//최대값
		System.out.println(Math.max(21, 30));
		System.out.println(Math.min(31, 20));
		
		System.out.println(Math.random());
		
		//1~45 숫자를 랜덤하게 뽑기
//		예시1]
//		int random=((int)(Math.random()*100))%45+1;
//		System.out.println(random);
		
//		while(true) {
//			int random2=(int)(Math.random()*100);
//		}
		
//		예시2]
		System.out.println(Math.floor(Math.random()*45)+1);
		
	}

}
