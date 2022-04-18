
public class BreakEx1 {
	/*
	 * break
	 *   break를 직접 감싸고 있는 반복문 하나만 종료 
	 */
	public static void main(String[] args) {
		int i=1, sum=0;
		
		//for(;true;) {} 가능
		
		while(true) {
			sum += i;
			i++;
			if(sum > 5000) {
				break;//반복문을 종료 하겠다.
			}
			//break는 반드시 if문이 같이 나온다. 단독으로 나오지 않는다.
			//반복문을 제어 할 때
		}
		System.out.println(sum);
	}

}
