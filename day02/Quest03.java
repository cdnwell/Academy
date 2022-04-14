import java.util.Scanner;

public class Quest03 {
	/*
	 * 정수 하나를 입력 받은 후
	 * 입력 받은 정수가 홀수이면 홀수라고 출력, 짝수면 짝수라고 출력
	 * 
	 * %, ==, 삼항연산자, String, int
	 */
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("정수를 입력해주세요 : ");
		n=sc.nextInt();
		//str = n % 2 == 0 ? "짝수" : "홀수";
		//System.out.println(str);
		
		//삼항연산자는 저장을 하거나 출력을 해야 한다.
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
	}

}
