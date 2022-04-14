
public class ShortCircuit {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		//단란회로 : AND나 OR 연산시 앞에 있는 조건의 결과가 이미 true나 false를 결정이 된 경우에는 뒤에 있는 연산을 생략한다.
		//or : false, and : ... 
		boolean result = n1 == 10 && ++n2 >10;
		//왼쪽 식을 검사해서 true나 false가 확정되면 뒤쪽 식은 검사하지 않는다.
		System.out.println(result);
		System.out.println(n2);
		
		result = n1 > 5 || ++n2 > 20;
		System.out.println(result);
		System.out.println(n2);
		
	}
	/* 	Primitive(고정형) type
			int, float, double, char, boolean, byte, short
			할당되는 메모리가 크기가 정해져있기 때문에 최대/최소값이 정해짐
			
		Reference(참조형) Type
			String
			저장된 데이터가 있는 위치를 저장(메모리 주소)
			저장할 수 있는 크기 가변적이다.
	*/
}	
