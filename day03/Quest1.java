import java.util.Scanner;

public class Quest1 {
	/*
	 * 숫자 두개를 입력해서
	 * 두 숫자의 뺄셈 결과를
	 * 무조건 양수로 되게끔 출력
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("첫번째 숫자 : ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		n2 = sc.nextInt();
		
//		if(n1>n2) {
//			System.out.println("결과 값 : " + (n1-n2));
//		}else {
//			System.out.println("결과 값 : " + (n2-n1));
//		}

		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		//두번째 방법, n1 과 n2 값 비교 후, 값 변경
		
		//세번째 방법, result = n1 - n2 식 비교로도 가능
		
		System.out.println("결과 값 : " + (n1 - n2));
		
	}

}
