package string;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		//StringBuilder str = "Hello World";
		//문자열이 아니기 때문에 안된다.
		StringBuilder str = new StringBuilder("Hello World");
		System.out.println(str);
		str.append(100);
		System.out.println(str);
		str.append("JAVA");
		System.out.println(str);
		
		//String, StringBuilder차이 값을 계속 변경해 갈 수 있느냐 없느냐 차이
		str.replace(0, 5, "TEST");
		System.out.println(str);
		//5번부터 9번까지 (10-1)
		str.delete(5, 10);
		System.out.println(str);
		System.out.println(str.toString());
	}
	
}
