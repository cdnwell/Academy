import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		
		System.out.print("숫자 입력 : ");
		num=sc.nextInt();
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		if(sum==num) {
			System.out.println("입력하신 숫자는 완전수입니다.");
		}else {
			System.out.println("입력하신 숫자는 완전수가 아닙니다.");
		}
		
	}
	
}

/* 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("숫자 하나 입력 : ");
 * int num = sc.nextInt();
 * int sum = 0;
 * 
 * for(int i=1;i<= num/2;i++){
 * 		if(num % i ==0) 
 * 			sum += i;
 * }
 * 
 * num/2 이하로 조건식을 설정해도 된다.
 * 
 * if(num == sum)
 * 		System.out.println("입력하신 숫자는 완전수 입니다.");
 * else
 * 		System.out.println("입력하신 숫자는 완전수가 아닙니다.");
 * 
 */
