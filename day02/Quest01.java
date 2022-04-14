import java.util.Scanner;

public class Quest01 {
	/*
	 * 정수형 변수 2개를 선언 한 후
	 * 정수 2개를 각각 입력을 받은 후
	 * 해당 변수 2개를 이용하여 모든 사칙연산의 결과를 출력
	 * 
	 * 정수 입력 : 5
	 * 정수 입력 : 3
	 * 
	 * (예시)
	 * 8
	 * 2
	 * 15
	 * 1
	 * 2
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.print("정수 하나 입력하세요 : ");
		n1 = sc.nextInt();
		System.out.print("정수 하나 입력하세요 : ");
		n2 = sc.nextInt();
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		
		
	}

}
