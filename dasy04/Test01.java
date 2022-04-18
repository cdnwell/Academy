
public class Test01 {

	public static void main(String[] args) {
		char upChr;
		char downChr;
		
		upChr='A';
		downChr='a';
		
		for(int i=0;i<26;i++) {
			System.out.println((char)(upChr+i)+" - "+(char)(downChr+i));
		}
		
	}
	
}

/*	for(char ch1='A',ch2='a';ch1<='Z';ch1++,ch2++){
 * 		System.out.println(ch1+ " - " +ch2);
 * 	}
 * 
 * 	for문에 두개 이상 증감식을 넣을 수 있다.
 */
