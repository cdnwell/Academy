
public class Array2DEx1 {

	public static void main(String[] args) {
		//정수형 배열을 3행 4열짜리로 생성한다.
		int [][] arr = new int[3][4];
		
		System.out.println("행 개수 : "+arr.length);
		//배열 명.length, 첫번째 칸 개수
		System.out.println("0번 행의 열 개수 : "+arr[0].length);
		//배열명[0].length, 두번쨰 칸 개수
		System.out.println("1번 행의 열 개수 : "+arr[1].length);
		System.out.println("2번 행의 열 개수 : "+arr[2].length);
		
		
		for(int i=0;i<arr.length;i++) { 
		//행번호 제어하는부분
			for(int j=0;j<arr[i].length;j++) {
				//arr[i].length는 i번째 열 개수를 만듦
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
