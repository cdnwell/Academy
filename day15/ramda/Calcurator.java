package ramda;

@FunctionalInterface
public interface Calcurator {
	
	public int calc(int x, int y);
	
}
//@FunctionalInterface가 들어가면 추상메서드가 하나만 들어간다.
//쓰면 문법적인 체크를 해줘서 쓰는 것이 좋다.