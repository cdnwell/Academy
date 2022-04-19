
public class Array2DEx2 {

	public static void main(String[] args) {
		int [][] arr = {
			//	 0 1 2 3
				{1,2,3,4},		//0번째 행
			//	 0 1 2 3
				{5,6},		//1번째 행
			//	 0 1  2  3
				{9,10,11,12}	//2번째 행
		};
		//2차원은 new 생성자 초기화가 안된다. 인덱스 값이 없으면 가능
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
