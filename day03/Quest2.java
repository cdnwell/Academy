import java.util.Scanner;

public class Quest2 {
	/*
	 * 정수형 변수 3개 선언하여
	 * 정수 3개를 입력 받아서 저장한 뒤에
	 * 입력한 정수들 중 제일 큰 값을 출력하시오 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		n1=sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		n2=sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		n3=sc.nextInt();
		
//		if(num1 > num2 && num1 > num3) {
//			System.out.println("제일 큰 값 : "+num1);
//		}else if (num2 > num1 && num2 > num3) {
//			System.out.println("제일 큰 값 : "+num2);
//		}else {
//			System.out.println("제일 큰 값 : "+num3);
//		}
		
		int max;
		
		if(n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
		}
		
		if(max < n3) {
			max = n3;
		}
		
		System.out.println(max);
		
		//두번째 방법, 승자승 방식
	}

}
