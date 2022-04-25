package super_ex;

public class AICar extends Car{
	private boolean mode;
	
	@Override
	public void driving() {
		if(mode)
			System.out.println("자율 주행을 시작합니다.");
		else
			super.driving();
	}
	
	public void changeMode() {
		mode = !mode;
		driving();
	}
	
}
