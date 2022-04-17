import java.util.Scanner;

public class WhileQuest1 {
	/*
	 * 
	 *	정수 하나를 입력 받아서 
	 *	입력 받은 정수 개수 만큼 Hello World 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num=sc.nextInt();
		
		while(num>0) {
			System.out.println("Hello World");
			num--;
		}
		// num != 0 위의 조건문과 결과가 같다.
		
	}
	
}
