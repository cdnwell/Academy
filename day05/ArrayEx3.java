import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		String str = "Hello World";
		char []arr= str.toCharArray();
		//문자열을 문자형 배열로 변환해서 저장
		// 0 1 2 3 4 5 6 7 8 9 10
		// H e l l o   W o r l d
		//
		
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//배열에 저장된 내용을 거꾸로 뒤집어서 저장
		//dlroW olleH <-- 배열에 저장
		
		//첫번쨰 예시
		
//		int j = 0;
//		for(int i=arr.length-1;i>(arr.length/2);i--) {
//			char temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//			j++;
//		}
		
		//두번째 예시
		int start=0;
		//end =arr.length-1;
		//end를 쓸수도 있지만 더 좋은 방법이 아래
		System.out.println(Arrays.toString(arr));
		//문자열 끝에 해당하는 인덱스는 배열길이 -1 -start로 구할 수 있음
		
		while(start<arr.length/2) {
			char temp= arr[start];				//temp에 arr[start] 글자 저장
			arr[start]=arr[arr.length-1-start];	//arr[start]에 arr[end] 글자 저장
			arr[arr.length-1-start]=temp;		//arr[end]에 temp 저장
			
			start++;
		}
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		
		//배열 내용을 한번에 확인가능하다. toString 메소드는 String형태로 바꿔줌
		System.out.println(Arrays.toString(arr));
		
	}

}
