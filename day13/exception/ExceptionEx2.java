package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
		System.out.println(1);
		System.out.println(5/1);
		System.out.println(2);
		int []arr = {1,2,3};
		arr[7]++;
		System.out.println(7);
		}
//		catch(Exception e){
//			
//		}
		//위 구문이 있으면 빨간줄, 우선순위가 높은 것 부터 써줘야한다.
		catch(ArithmeticException e) {
			System.out.println(4);
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(5);
			System.out.println(e.getMessage());
			e.printStackTrace();		//빨간색 메시지
		}
		System.out.println(6);
	}

}
