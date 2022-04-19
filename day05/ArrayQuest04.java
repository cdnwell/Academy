import java.util.Arrays;

public class ArrayQuest04 {

	public static void main(String[] args) {
		String str ="hello world";
		char [] arr= str.toCharArray();
		
		/*
		 * 배열 arr에 있는 모든 알파벳을 대문자로 변경 후 출력
		 */
		
		char A= 'A';		//
		char a = 'a';		//아스키 코드 값 97
		char space= ' ';	//코드 값 32
		//대문자로 바꿀때 -32
		
		System.out.println((int)A);
		System.out.println((int)a);
		System.out.println((int)space);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='a' && arr[i] <= 'z') {
				//다운캐스팅 할 때 직접 해줘야한다.
				//작은 개념이 큰 개념이 될 때는 자동으로 된다.
				//'a'는 값 97로 저장된다.
				//arr[i] <= 'z'도 추가해주어야 밖의 글자를 계산안할 수 있다.
				
				arr[i]-=32;
				// -=을 하면 형변환을 안한다.
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		//소문자로 출력 소문자는 스페이스바 값도 생각해야된다
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<='Z' && arr[i]>='A')
				arr[i]+=32;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
