package exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(5/1);
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}finally {		//무조건 실행되는 영역
			System.out.println(4);
		}
		System.out.println(5);
		
	}

}
