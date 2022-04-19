import java.util.Scanner;

public class ArrayQuest03 {
	/*
	 * 정수형 배열 길이가 10인 배열을 선언할때
	 * 원하는 값으로 초기화를 한 후에
	 * 배열에 있는 값들 중 짝수와 홀수의 개수를 출력 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1=0,num2=0;
		//num1=홀수 갯수, num2=짝수 갯수
		
		int []arr= {10,20,14,15,26,4,7,9,12,7 };
		
		for(int i=0;i<10;i++) {
			if(arr[i]%2==0) {
				num2++;
			}else {
				num1++;
			}
		}
		
		System.out.println("배열의 짝수 갯수 : "+num2);
		System.out.println("배열의 홀수 갯수 : "+num1);
		//전체 갯수 뺴기 짝수 개수 = 홀수 개수
	}

}
