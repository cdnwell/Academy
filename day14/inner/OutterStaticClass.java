package inner;

public class OutterStaticClass {
	private int outter;
	private static double n = 23.4551;
	
	public OutterStaticClass(int outter) {
		this.outter = outter;
	}
	
	public static class InnerStaticClass {
		private int i;

		public InnerStaticClass(int i) {
			this.i = i;
		}
		
		public int sum() {
//			return i+outter; 
			// static클래스라 outter 변수가 생성됐는지 알 수 없기 때문에 접근할 수 없다.
			// 설명] outter가 non-static이기 때문에 접근이 불가하다.
			return (int)(i+n);	// 설명] 이것은 문제없다
			//static inner class는 굳이 필요없음
		}
	}
	
}
