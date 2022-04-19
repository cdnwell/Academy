
public class RaggedArrayEx {

	public static void main(String[] args) {
		//래기드 배열
		int [][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[]{1,5,6,78,9,0,2};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		//줄에 대한 정보 주소값
		arr[0] = new int[5];
		System.out.println(arr[0]);
		//배열[i][] i의 주소가 나온다. 주소는 각 행마다 다르다.
		
		System.out.println(arr[0].length);		//arr배열의 0행의 길이 5
		System.out.println(arr[1].length);		//arr배열의 1행의 길이 3
		System.out.println(arr[2].length);		//arr배열의 2행의 길이 7
	}

}
