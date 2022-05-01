package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(5/0);		//Exception 발생... 뒤에 있는 프로그램 실행 안됨
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}
		System.out.println(4);
		
	}

}
