import java.util.Scanner;

public class IfQuest {
	/*
	 * 숫자 하나를 입력 받아서
	 * 해당 숫자의 홀수 짝수를 출력 
	 * 숫자 0은 짝수로 취급
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수를 입력해주세요 : ");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		if(num%2==1) {
			System.out.println("홀수입니다.");
		}
		
	}

}
/*
 * 연산자 우선순위 
 *
 * result = n1 + 10 > 5 && ++n2 * 19 >=20
 * 
 * ()괄호
 * 증감연산자
 * 사칙연사자
 * 관계연산자
 * 논리연산자
 * 대입연산자
 * 
 */