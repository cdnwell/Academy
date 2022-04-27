package generic_extends;

public class ImportMouse<T extends Mouse> {
	//T는 Mouse를 상속받는 클래스만 올 수 있다.
	//Mouse 외적인 클래스는 안된다.
	private T mouse;

	public ImportMouse(T mouse) {
		this.mouse = mouse;
	}
	
	public void click(int n) {
		mouse.click(n);
	}
	
	public void wheel() {
		mouse.wheel();
	}
	
}
