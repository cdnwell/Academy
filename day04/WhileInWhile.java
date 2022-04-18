
public class WhileInWhile {

	public static void main(String[] args) {
		int dan=2,j=1;
		
		while(dan<10) {
			System.out.println(dan+"단");
			j=1;//중첩된 반복문을 실행하기 전에 제어 변수 초기화 
			while(j<10) {
				System.out.println(dan+" * "+j+" = "+dan*j);
				j++;
			}
			dan++;
			System.out.println();
		}
	}

}
