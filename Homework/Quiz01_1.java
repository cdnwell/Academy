package step01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개 입력하세요");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = A*B*C;
		System.out.println(result);
		
		int []arr = new int[10];
		
		String str = String.valueOf(result);
//		String str = result + "";
		//숫자를 문자로 바꿈
		
		char[] numbers = str.toCharArray();
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println((int)numbers[i]-48);
			arr[numbers[i]-48]++;
		}

		System.out.println(Arrays.toString(arr));
		
	}

}
