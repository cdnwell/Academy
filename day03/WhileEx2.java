
public class WhileEx2 {
	/*
	 *  1~100까지 숫자를 더한 결과를 출력
	 * 
	 */
	public static void main(String[] args) {
		int num=1;
		int total=0;
		
		while(num<=100) {
			total+=num++;
			//num++;
		}
		
//		num=0;
//		while(num++<100) {
//			total+=num;
//		}
		
		System.out.println("합계 : "+total);
		
	}

}
