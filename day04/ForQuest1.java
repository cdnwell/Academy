import java.util.Scanner;

public class ForQuest1 {
	/*
	 * 숫자 두개를 입력 받은 후
	 * 입력한 숫자들 중 작은 숫자부터 큰 숫자까지의 합을 출력
	 * 
	 * 숫자 입력 : 1
	 * 숫자 입력 : 100
	 * 1부터 100까지 더한 값
	 * 합 : 5050
	 */
	public static void main(String[] args) {
		//정수 두개 입력 후 변수에 저장
		//합을 저장할 정수형 변수 선언
		//큰 숫자 작은 숫자를 구분해서 저장
		//반복문 - 작은 숫자 부터 큰 숫자까지 반복
		//		 숫자를 합에다가 누적
		//총합을 출력
		Scanner sc =new Scanner(System.in);
		int num1,num2;
		int total =0;
		
		System.out.print("첫번째 숫자 입력 : ");
		num1=sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		num2=sc.nextInt();
		
		//num1이 더 크다
		//큰 숫자 작은 숫자를 구분해서 저장
		if(num1<num2) {
			 int temp=num1;
			 num1=num2;
			 num2=temp;
		}

//		if(num1 < num2) {
//			
//		}else {
//			
//		}
		//위 코드도 가능하다
		
		for(int i=num2;i<=num1;i++) {
			total+=i;
		}
		
//		for(int i=num2;i<=num1;i++) 
//			total+=i;
//		한 줄이면 중괄호 안써도 된다.
		
		System.out.println("총 합 : "+total);
		
	}

}
