
public class WhileEx1 {
	/*
	 * 		while(조건식){
	 * 			반복할 코드 1
	 * 			반복할 코드 2
	 * 			....
	 * 		}
	 * 		while문은 조건식이 true 면 {실행할 영역} 코드를 반복을 한다.
	 *		조건식이 false이면 반복을 멈춘다. 
	 */
	public static void main(String[] args) {
		int i = 0;	//반복문을 만들 때 초기값을 신경 써야 한다.
		while(i < 5) {	//그 다음은 조건식
			System.out.println("Hello World");
			i++;		//제어변수의 증감식 필요
		}
		//i--; 무한루트, 강제 종료가 필요하다. 
	}
}
