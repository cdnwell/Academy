
public class Operator2 {
	/*
	 * 복합대입연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
	 * 		+=	-=	*=	/=	%=
	 *
	 */
	public static void main(String[] args) {
		int n = 10;
		//n = n + 10;	//변수 n에 숫자 10을 더해서 저장
		n += 10;
		//축약연산자, 단축연산자
		System.out.println(n);
		
		n -= 3;		//변수 n에 숫자 3을 뺀다음 저장
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		n /= 4;
		System.out.println(n);
		
		n %= 7;
		System.out.println(n);
		
	}

}
