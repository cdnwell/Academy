
public class Operator1 {
	/*
	 *		사칙연산
	 *			덧셈		+
	 *			뺄셈		-
	 *			곱셈		*
	 *			나눗셈 	/	<--- 몫(정수), 소수점(실수)
	 *			나눗셈	%	<--- 나머지(정수)
	 *
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언, 변수명은 자유롭게
		//초기화는 각각 5, 3으로 변수를 초기화
		
		int i=5;
		int	j=3;
		//정수와 정수를 계산하면 정수가 나온다.
		System.out.println(i + j);	//8
		System.out.println(i - j);	//2
		System.out.println(i * j);	//15
		System.out.println(i / j);	//1
		System.out.println(i % j);	//2
		//대입 연산자가 없으면 값이 바뀌지 않는다.
		
		//계산한 결과를 변수에 저장
		int result = 0;
		
		result = i + j;	//i와 j의 계싼된 결과값을 result에 저장한다.
		//식을 저장하는 것이 아니다.
		//i, j 값은 변경사항 없음
		System.out.println(result);
		//식을 저장한다면 i + j = 105
		result = i * j;
		System.out.println(result);	//15
		
		double d = 12.456;
		//정수와 실수를 계산하면 정수가 실수로 형변환이 된다.
		System.out.println(i * d);
		System.out.println(d / i);
		
		System.out.println((int)(1.5 * 3));
		System.out.println((int)1.5*3);
		
	}

}
