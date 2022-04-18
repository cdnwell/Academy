import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1,num2;
		int max = 0;
		
		System.out.print("숫자 입력 : ");
		num1=sc.nextInt();
		System.out.print("숫자 입력 : ");
		num2=sc.nextInt();
		
		if(num1<num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		
		for(int i =1;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {
				max=i;
			}
		}
		
		System.out.println("두 수의 최대 공약수 : "+max);	
		
	}
	
}

/*
 * System.out.print("숫자 입력 : ");
 * int n1 = sc.nextInt();
 * System.out.print("숫자 입력 : ");
 * int n2 = sc.nextInt();
 * 
 * 작은 수가 필요
 * 
 * if(n1 > n2){
 * 		int temp =n1;
 * 		n1 = n2;
 * 		n2 = temp;
 * }
 * 
 * int gcm = 1;
 * 
 * for (int i = 2; i <=n1; i++){
 * 		if(n1 % i == 0 && n2 % i ==0 )
 * 			gcm = i;
 * }
 * 
 * System.out.println("두 수의 최대 공약수 : "+gcm);
 * 
 * 
 */
