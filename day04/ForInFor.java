
public class ForInFor {

	public static void main(String[] args) {
//		int dan=2,j=1;
//		
//		while(dan<10) {
//			System.out.println(dan+"단");
//			j=1;//중첩된 반복문을 실행하기 전에 제어 변수 초기화 
//			while(j<10) {
//				System.out.println(dan+" * "+j+" = "+dan*j);
//				j++;
//			}
//			dan++;
//			System.out.println();
//		}
		
		//int dan,i;
		for(int dan=2;dan<10;dan++) {
			System.out.println(dan+"단");
			for(int i=1;i<10;i++) {
				System.out.println(dan+" * "+i+" = "+dan*i);
			}
			System.out.println();
		
		}
	}
}
