package inter_ex;

public interface InterA {
	//public static final은 자동으로 붙음
	double PI = 3.1415;
	
	//dafault method --> jdk8 버전 부터 지원
	default double circleArea(int r) {
		return r * r * PI;
	}
	
	public void interA();
	
}
