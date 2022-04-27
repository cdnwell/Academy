package wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		Integer n1 = 100;
		Integer n2 = new Integer("200");
		System.out.println(n1+n2);
		//Wrapper 클래스 사용법
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123")*2);
		System.out.println(Double.parseDouble("3.1415")*7);
		
		int i1 = 100;
		//primitive 타입을 객체로 감쌌다. --> box, 자동으로 해줌 --> auto boxing
		Integer i2 = i1; 	
		//auto unboxing, jdk 1.5버전 부터 지원
		int i3 = i2;
		
		//1.5 이전 버전에서의 boxing과 unboxing
		//primitive type <--> reference type
		int i4 = 100;
		Object obj = i4;
		Integer i5 = (Integer) obj;		//boxing 과정
		
		Object val = i5;				//unboxing 과정				
		int i6 =(int) val;
		
	}
	
}
