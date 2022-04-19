
public class ArrayEx2 {

	public static void main(String[] args) {
		//정수형 배열 5개짜리로 선언 - 순서대로 초기화
		//			 0 1 2 3 4
		int []arr1= {1,2,3,4,5,6,7,8,9};
		//중괄호로 초기화, c언어 방식
		
		int []arr2 = new int[] {1,2,3,4,5,6};
		//위의 초기화와 같은 방식으로 실행된다. 생성과 동시에 초기화 하는 방법2
		
		//배열에 있는 내용을 전부 출력
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println("배열의 길이 : " + arr1.length);
		
		//for문 
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
