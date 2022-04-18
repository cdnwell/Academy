
public class ContinueEx {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i%2 ==1) {
				continue;
			}
			System.out.println(i);
			//continue도 if랑 같이 나온다. 절대 단독으로 나오지 않는다.
			
		}
		
	}

}
