import java.util.Scanner;

public class ForQuest2 {
	/*
	 * 숫자 0을 입력 할 때 까지 
	 * 정수를 입력 받아서
	 * 0을 입력을 하면 입력한 숫자들의 총합과 평균을 출력
	 * 
	 * 숫자 입력 : 1
	 * 숫자 입력 : 5
	 * 숫자 입력 :	-1
	 * 숫자 입력 : 2
	 * 숫자 입력 : 0
	 * 
	 * 총합 : 7
	 * 평균 : 1.75
	 * 
	 */
	/*
	 * 입력 받을 변수
	 * int num;
	 * 총합, 개수 저장할 변수
	 * int sum = 0, count =0;
	 * double avg = 0.0;
	 * 
	 *			//입력받은 숫자가 0일때 반복문을 종료
	 * for(	 ;num!=0;	){
	 * 		System.out.print("정수 입력 : ");
	 * 		num =sc.nextInt();
	 * 		sum += num;
	 *		avg += num; 
	 * 		count++;
	 * }
	 * count--;	//숫자 0은 개수에서 제외
	 * System.out.println("총합 : "+sum);
	 * System.out.println("평균 : "+sum / (double)count);
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		int total=0;
		double count=0;
		double avr;
		//매번 형변환이 일어나 값이 정확하지 않을 수가 있다.
		//마지막에만 형변환을 하면 값이 더 정확하다.
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		count++;
		while(num!=0) {
			
			total+=num;
			System.out.print("정수 입력 : ");
			num =sc.nextInt();
			count++;
		}
		avr=total/(count-1);
		System.out.println("총합 : "+total);
		System.out.println("평균 : "+avr);
	}

}
