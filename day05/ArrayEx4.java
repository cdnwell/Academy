import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		//정수형 배열 10개 값 아무거나 넣어보기
		int []arr= {1,3,5,7,9,14,17,21,2,4};
		
		//for each문
		//jdk 1.5이상 옛날 자바는 안된다.
		//n은 arr로부터 값을 하나씩 복사 받기때문에 n값이 바뀌어도
		//arr과는 상관이 없다.
		for(int n: arr) {
			System.out.println(n);
			n++;
		}
		//for each문은 읽기만 하고 값을 바꾸지는 않는다.
		
		System.out.println(Arrays.toString(arr));
		
	}

}
