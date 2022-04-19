import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		int [] arr1=new int[4];
		char [] arr2=new char[4];
		double [] arr3=new double[4];
 		boolean [] arr4=new boolean[4];
		String [] arr5=new String[5];
 		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		// '\0' = 널문자, char형의 초기값
		// null = 데이터가 없다는 의미
//		String str=null;
//		System.out.println(str);
	}

}
