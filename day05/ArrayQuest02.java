import java.util.Scanner;

public class ArrayQuest02 {
	/*
	 * 정수형 배열 길이가 10개인 배열을 생성한 후
	 * 정수를 입력받아서 배열에 각 요소에 전부 입력을 한 후
	 * 배열에 있는 값들 중 제일 큰 값, 제일 작은 값을 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []num=new int [10];
//		int min,max;
		//배열에 정수 입력
		
		for(int i=0;i<10;i++) {
			System.out.print("정수 입력 : ");
			num[i]=sc.nextInt();
		}
		
		//최대값 최소값 저장할 변수를 선언하고 초기화
//		max = num[0];
//		min = num[0];
		
		int max,min;
		max = min = num[0];
		//한번에 초기화하는 방법
		
		for(int i=0;i<9;i++) {
			
			if(num[i]<num[i+1]) {
				if(max>num[i+1])
					continue;
				max=num[i+1];
			}
			
			if(num[i]>num[i+1]) {
				if(min<num[i+1]) 
					continue;
				min=num[i+1];
			}
			
		}
		
		/*
		 * (두번째 예시)
		 * for(int i = 0; i < arr.length; i++){
		 * 		//max에 저장된 값이 배열 요소보다 작으면 배열 요소값을 max에 저장
		 * 		//max에는 큰 값만 저장한다.
		 * 		if(max < arr[i])
		 * 			max = arr[i];
		 * 		if(min > arr[i])
		 * 			min = arr[i];
		 * }
		 */
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}

}
